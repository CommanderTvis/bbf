package org.jetbrains.kootstrap.util

import org.apache.commons.cli.CommandLine
import org.apache.commons.cli.DefaultParser
import org.apache.commons.cli.Option
import org.apache.commons.cli.Options

/**
 * Created by akhin on 7/11/16.
 */

object Opt {

    private val options = Options()

    private val parser = DefaultParser()

    val targetRoot: Option = Option.builder("t")
            .longOpt("targetRoot")
            .required(false)
            .hasArg()
            .build()

    val kotlinRoot: Option = Option.builder("k")
            .longOpt("kotlinRoot")
            .required(false)
            .hasArg()
            .build()

    val jarFile: Option = Option.builder("j")
            .longOpt("jarFile")
            .required(false)
            .hasArg()
            .build()

    val pomFile: Option = Option.builder("p")
            .longOpt("pomFile")
            .required(false)
            .hasArg()
            .build()

    init {
        Opt::class.java.declaredFields
                .filter { Option::class.java == it.type }
                .forEach { options.addOption(it.get(this) as Option) }
    }

    fun parse(args: Array<String>): CommandLine = parser.parse(options, args)

}

val CommandLine.targetRoots: List<String>
    get() = this.getOptionValues(Opt.targetRoot.opt)?.toList()
            ?: emptyList()

val CommandLine.kotlinRoots: List<String>
    get() = this.getOptionValues(Opt.kotlinRoot.opt)?.asList()
            ?: emptyList()

val CommandLine.jarFiles: List<String>
    get() = this.getOptionValues(Opt.jarFile.opt)?.asList()
            ?: emptyList()

val CommandLine.pomFile: String
    get() = this.getOptionValue(Opt.pomFile.opt)
            ?: ""
