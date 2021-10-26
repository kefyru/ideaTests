package com.github.kefyru.ideatests.services

import com.intellij.openapi.project.Project
import com.github.kefyru.ideatests.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
