package com.github.soni801.intellijmcfunctionplugin.services

import com.github.soni801.intellijmcfunctionplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
