task("taskX") {
    dependsOn("taskY")
    doLast {
        println("taskX")
    }
}
task("taskY") {
    doLast {
        println("taskY")
    }
}
