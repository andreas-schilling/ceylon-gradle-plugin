package com.athaydes.gradle.ceylon.task

import com.athaydes.gradle.ceylon.CeylonConfig
import com.athaydes.gradle.ceylon.util.CeylonCommandOptions
import com.athaydes.gradle.ceylon.util.CeylonRunner
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class RunCeylonTask extends DefaultTask {

    @TaskAction
    void run() {
        final config = project.extensions.getByType( CeylonConfig )

        CeylonRunner.run 'run', config.module, project, config,
                CeylonCommandOptions.getRunOptions( project, config )
    }

}