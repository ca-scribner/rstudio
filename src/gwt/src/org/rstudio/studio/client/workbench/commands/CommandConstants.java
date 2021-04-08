package org.rstudio.studio.client.workbench.commands;
import com.google.gwt.i18n.client.Constants;

public interface CommandConstants extends Constants {
    // Command: setWorkingDirToProjectDir
    @DefaultStringValue("(D)Set Working Directory to Project Directory")
    String setWorkingDirToProjectDirLabel();
    @DefaultStringValue("(D)")
    String setWorkingDirToProjectDirButtonlabel();
    @DefaultStringValue("(D)To _Project Directory")
    String setWorkingDirToProjectDirMenulabel();
    @DefaultStringValue("(D)Change working directory to project root directory")
    String setWorkingDirToProjectDirDesc();
    
    // Command: setWorkingDirToActiveDoc
    @DefaultStringValue("(D)Set Working Directory to Current Document's Directory")
    String setWorkingDirToActiveDocLabel();
    @DefaultStringValue("(D)")
    String setWorkingDirToActiveDocButtonlabel();
    @DefaultStringValue("(D)To _Source File Location")
    String setWorkingDirToActiveDocMenulabel();
    @DefaultStringValue("(D)Change working directory to path of active document")
    String setWorkingDirToActiveDocDesc();
    
    // Command: setWorkingDirToFilesPane
    @DefaultStringValue("(D)Set Working Directory to Directory in Files Pane")
    String setWorkingDirToFilesPaneLabel();
    @DefaultStringValue("(D)")
    String setWorkingDirToFilesPaneButtonlabel();
    @DefaultStringValue("(D)To _Files Pane Location")
    String setWorkingDirToFilesPaneMenulabel();
    @DefaultStringValue("(D)Change working directory to location of Files pane")
    String setWorkingDirToFilesPaneDesc();
    
    // Command: setWorkingDir
    @DefaultStringValue("(D)Set Working Directory...")
    String setWorkingDirLabel();
    @DefaultStringValue("(D)")
    String setWorkingDirButtonlabel();
    @DefaultStringValue("(D)_Choose Directory...")
    String setWorkingDirMenulabel();
    @DefaultStringValue("(D)Select and change to a new working directory")
    String setWorkingDirDesc();
    
    // Command: newSourceDoc
    @DefaultStringValue("(D)Create a New R Script")
    String newSourceDocLabel();
    @DefaultStringValue("(D)")
    String newSourceDocButtonlabel();
    @DefaultStringValue("(D)_R Script")
    String newSourceDocMenulabel();
    @DefaultStringValue("(D)Create a new R script")
    String newSourceDocDesc();
    
    // Command: newRNotebook
    @DefaultStringValue("(D)R _Notebook")
    String newRNotebookMenulabel();
    @DefaultStringValue("(D)Create a new R Markdown notebook")
    String newRNotebookDesc();
    
    // Command: newTextDoc
    @DefaultStringValue("(D)_Text File")
    String newTextDocMenulabel();
    @DefaultStringValue("(D)Create a new text file")
    String newTextDocDesc();
    
    // Command: newCDoc
    @DefaultStringValue("(D)_C File")
    String newCDocMenulabel();
    @DefaultStringValue("(D)Create a new C file")
    String newCDocDesc();
    
    // Command: newCppDoc
    @DefaultStringValue("(D)_C++ File")
    String newCppDocMenulabel();
    @DefaultStringValue("(D)Create a new C++ file")
    String newCppDocDesc();
    
    // Command: newHeaderDoc
    @DefaultStringValue("(D)_Header File")
    String newHeaderDocMenulabel();
    @DefaultStringValue("(D)Create a new header file")
    String newHeaderDocDesc();
    
    // Command: newMarkdownDoc
    @DefaultStringValue("(D)_Markdown File")
    String newMarkdownDocMenulabel();
    @DefaultStringValue("(D)Create a new Markdown document")
    String newMarkdownDocDesc();
    
    // Command: newPythonDoc
    @DefaultStringValue("(D)_Python Script")
    String newPythonDocMenulabel();
    @DefaultStringValue("(D)Create a new Python script")
    String newPythonDocDesc();
    
    // Command: newShellDoc
    @DefaultStringValue("(D)_Shell Script")
    String newShellDocMenulabel();
    @DefaultStringValue("(D)Create a new shell script")
    String newShellDocDesc();
    
    // Command: newStanDoc
    @DefaultStringValue("(D)_Stan File")
    String newStanDocMenulabel();
    @DefaultStringValue("(D)Create a new Stan program")
    String newStanDocDesc();
    
    // Command: newHtmlDoc
    @DefaultStringValue("(D)_HTML File")
    String newHtmlDocMenulabel();
    @DefaultStringValue("(D)Create a new HTML file")
    String newHtmlDocDesc();
    
    // Command: newJavaScriptDoc
    @DefaultStringValue("(D)_JavaScript File")
    String newJavaScriptDocMenulabel();
    @DefaultStringValue("(D)Create a new JavaScript file")
    String newJavaScriptDocDesc();
    
    // Command: newCssDoc
    @DefaultStringValue("(D)_CSS File")
    String newCssDocMenulabel();
    @DefaultStringValue("(D)Create a new CSS file")
    String newCssDocDesc();
    
    // Command: newD3Doc
    @DefaultStringValue("(D)_D3 Script")
    String newD3DocMenulabel();
    @DefaultStringValue("(D)Create a new D3 Script")
    String newD3DocDesc();
    
    // Command: newRPlumberDoc
    @DefaultStringValue("(D)Plumber _API...")
    String newRPlumberDocMenulabel();
    @DefaultStringValue("(D)Create a new Plumber API")
    String newRPlumberDocDesc();
    
    // Command: rcppHelp
    @DefaultStringValue("(D)Help on using Rcpp")
    String rcppHelpDesc();
    
    // Command: printCppCompletions
    @DefaultStringValue("(D)Print C++ Completions")
    String printCppCompletionsDesc();
    
    // Command: newSweaveDoc
    @DefaultStringValue("(D)R _Sweave")
    String newSweaveDocMenulabel();
    @DefaultStringValue("(D)Create a new R Sweave document")
    String newSweaveDocDesc();
    
    // Command: newRMarkdownDoc
    @DefaultStringValue("(D)R _Markdown...")
    String newRMarkdownDocMenulabel();
    @DefaultStringValue("(D)Create a new R Markdown document")
    String newRMarkdownDocDesc();
    
    // Command: newRShinyApp
    @DefaultStringValue("(D)Shiny _Web App...")
    String newRShinyAppMenulabel();
    @DefaultStringValue("(D)Create a new Shiny web application")
    String newRShinyAppDesc();
    
    // Command: newRHTMLDoc
    @DefaultStringValue("(D)R _HTML")
    String newRHTMLDocMenulabel();
    @DefaultStringValue("(D)Create a new R HTML document")
    String newRHTMLDocDesc();
    
    // Command: newRPresentationDoc
    @DefaultStringValue("(D)R _Presentation")
    String newRPresentationDocMenulabel();
    @DefaultStringValue("(D)Create a new R presentation")
    String newRPresentationDocDesc();
    
    // Command: newRDocumentationDoc
    @DefaultStringValue("(D)R Doc_umentation...")
    String newRDocumentationDocMenulabel();
    @DefaultStringValue("(D)Create a new Rd documentation file")
    String newRDocumentationDocDesc();
    
    // Command: newSqlDoc
    @DefaultStringValue("(D)S_QL Script")
    String newSqlDocMenulabel();
    @DefaultStringValue("(D)Create a new SQL script")
    String newSqlDocDesc();
    
    // Command: openSourceDoc
    @DefaultStringValue("(D)Open File...")
    String openSourceDocLabel();
    @DefaultStringValue("(D)")
    String openSourceDocButtonlabel();
    @DefaultStringValue("(D)_Open File...")
    String openSourceDocMenulabel();
    @DefaultStringValue("(D)Open an existing file")
    String openSourceDocDesc();
    
    // Command: openSourceDocNewColumn
    @DefaultStringValue("(D)Open File in New Column...")
    String openSourceDocNewColumnLabel();
    @DefaultStringValue("(D)")
    String openSourceDocNewColumnButtonlabel();
    @DefaultStringValue("(D)Open File in New C_olumn...")
    String openSourceDocNewColumnMenulabel();
    @DefaultStringValue("(D)Open an existing file in a new column")
    String openSourceDocNewColumnDesc();
    
    // Command: reopenSourceDocWithEncoding
    @DefaultStringValue("(D)Reopen Current Document with Encoding...")
    String reopenSourceDocWithEncodingLabel();
    @DefaultStringValue("(D)")
    String reopenSourceDocWithEncodingButtonlabel();
    @DefaultStringValue("(D)Reopen with _Encoding...")
    String reopenSourceDocWithEncodingMenulabel();
    @DefaultStringValue("(D)Reopen the current file with a different encoding")
    String reopenSourceDocWithEncodingDesc();
    
    // Command: saveSourceDoc
    @DefaultStringValue("(D)Save Current Document")
    String saveSourceDocLabel();
    @DefaultStringValue("(D)")
    String saveSourceDocButtonlabel();
    @DefaultStringValue("(D)_Save")
    String saveSourceDocMenulabel();
    @DefaultStringValue("(D)Save current document")
    String saveSourceDocDesc();
    
    // Command: renameSourceDoc
    @DefaultStringValue("(D)Rename Current Document")
    String renameSourceDocLabel();
    @DefaultStringValue("(D)")
    String renameSourceDocButtonlabel();
    @DefaultStringValue("(D)_Rename")
    String renameSourceDocMenulabel();
    @DefaultStringValue("(D)Rename current document")
    String renameSourceDocDesc();
    
    // Command: copySourceDocPath
    @DefaultStringValue("(D)Copy Document Path")
    String copySourceDocPathLabel();
    @DefaultStringValue("(D)")
    String copySourceDocPathButtonlabel();
    @DefaultStringValue("(D)Copy Path")
    String copySourceDocPathMenulabel();
    @DefaultStringValue("(D)Copy current document path")
    String copySourceDocPathDesc();
    
    // Command: saveSourceDocAs
    @DefaultStringValue("(D)Save Current Document As...")
    String saveSourceDocAsLabel();
    @DefaultStringValue("(D)Save as")
    String saveSourceDocAsButtonlabel();
    @DefaultStringValue("(D)Save _As...")
    String saveSourceDocAsMenulabel();
    @DefaultStringValue("(D)Save current file to a specific path")
    String saveSourceDocAsDesc();
    
    // Command: saveAllSourceDocs
    @DefaultStringValue("(D)Save All Source Documents")
    String saveAllSourceDocsLabel();
    @DefaultStringValue("(D)")
    String saveAllSourceDocsButtonlabel();
    @DefaultStringValue("(D)Sa_ve All")
    String saveAllSourceDocsMenulabel();
    @DefaultStringValue("(D)Save all open documents")
    String saveAllSourceDocsDesc();
    
    // Command: saveSourceDocWithEncoding
    @DefaultStringValue("(D)Save Current Document with Encoding...")
    String saveSourceDocWithEncodingLabel();
    @DefaultStringValue("(D)Save wit_h Encoding...")
    String saveSourceDocWithEncodingMenulabel();
    @DefaultStringValue("(D)Save the current file with a different encoding")
    String saveSourceDocWithEncodingDesc();
    
    // Command: closeSourceDoc
    @DefaultStringValue("(D)Close Current Document")
    String closeSourceDocLabel();
    @DefaultStringValue("(D)_Close")
    String closeSourceDocMenulabel();
    
    // Command: closeAllSourceDocs
    @DefaultStringValue("(D)Close All Documents")
    String closeAllSourceDocsLabel();
    @DefaultStringValue("(D)C_lose All")
    String closeAllSourceDocsMenulabel();
    
    // Command: closeOtherSourceDocs
    @DefaultStringValue("(D)Close Other Documents")
    String closeOtherSourceDocsLabel();
    @DefaultStringValue("(D)Close All E_xcept Current")
    String closeOtherSourceDocsMenulabel();
    
    // Command: vcsFileDiff
    @DefaultStringValue("(D)Show Differences for File")
    String vcsFileDiffLabel();
    @DefaultStringValue("(D)_Diff of")
    String vcsFileDiffMenulabel();
    @DefaultStringValue("(D)Show differences for the file")
    String vcsFileDiffDesc();
    
    // Command: vcsFileLog
    @DefaultStringValue("(D)Show Changelog for File")
    String vcsFileLogLabel();
    @DefaultStringValue("(D)_Log of")
    String vcsFileLogMenulabel();
    @DefaultStringValue("(D)Show log of changes to the file")
    String vcsFileLogDesc();
    
    // Command: vcsFileRevert
    @DefaultStringValue("(D)Revert Changes to File")
    String vcsFileRevertLabel();
    @DefaultStringValue("(D)_Revert")
    String vcsFileRevertMenulabel();
    @DefaultStringValue("(D)Revert changes to the file")
    String vcsFileRevertDesc();
    
    // Command: vcsViewOnGitHub
    @DefaultStringValue("(D)View file on GitHub")
    String vcsViewOnGitHubLabel();
    @DefaultStringValue("(D)_View FILE on GitHub")
    String vcsViewOnGitHubMenulabel();
    @DefaultStringValue("(D)View this file on Github")
    String vcsViewOnGitHubDesc();
    
    // Command: vcsBlameOnGitHub
    @DefaultStringValue("(D)View 'git blame' on GitHub")
    String vcsBlameOnGitHubLabel();
    @DefaultStringValue("(D)_Blame FILE on GitHub")
    String vcsBlameOnGitHubMenulabel();
    @DefaultStringValue("(D)Blame view for this file on Github")
    String vcsBlameOnGitHubDesc();
    
    // Command: printSourceDoc
    @DefaultStringValue("(D)")
    String printSourceDocButtonlabel();
    @DefaultStringValue("(D)Pr_int...")
    String printSourceDocMenulabel();
    @DefaultStringValue("(D)Print the current file")
    String printSourceDocDesc();
    
    // Command: popoutDoc
    @DefaultStringValue("(D)Show Document in New Window")
    String popoutDocLabel();
    @DefaultStringValue("(D)")
    String popoutDocButtonlabel();
    @DefaultStringValue("(D)Show in new window")
    String popoutDocDesc();
    
    // Command: returnDocToMain
    @DefaultStringValue("(D)Return Document to Main Window")
    String returnDocToMainLabel();
    @DefaultStringValue("(D)")
    String returnDocToMainButtonlabel();
    @DefaultStringValue("(D)Return to main window")
    String returnDocToMainDesc();
    
    // Command: mru0
    
    // Command: mru1
    
    // Command: mru2
    
    // Command: mru3
    
    // Command: mru4
    
    // Command: mru5
    
    // Command: mru6
    
    // Command: mru7
    
    // Command: mru8
    
    // Command: mru9
    
    // Command: mru10
    
    // Command: mru11
    
    // Command: mru12
    
    // Command: mru13
    
    // Command: mru14
    
    // Command: clearRecentFiles
    @DefaultStringValue("(D)_Clear List")
    String clearRecentFilesMenulabel();
    
    // Command: newProject
    @DefaultStringValue("(D)Create a New Project...")
    String newProjectLabel();
    @DefaultStringValue("(D)")
    String newProjectButtonlabel();
    @DefaultStringValue("(D)New _Project...")
    String newProjectMenulabel();
    @DefaultStringValue("(D)Create a project")
    String newProjectDesc();
    
    // Command: openProject
    @DefaultStringValue("(D)Open Project...")
    String openProjectLabel();
    @DefaultStringValue("(D)")
    String openProjectButtonlabel();
    @DefaultStringValue("(D)Ope_n Project...")
    String openProjectMenulabel();
    @DefaultStringValue("(D)Open a project")
    String openProjectDesc();
    
    // Command: openProjectInNewWindow
    @DefaultStringValue("(D)Open Project with New R Session")
    String openProjectInNewWindowLabel();
    @DefaultStringValue("(D)")
    String openProjectInNewWindowButtonlabel();
    @DefaultStringValue("(D)Open Project in Ne_w Session...")
    String openProjectInNewWindowMenulabel();
    @DefaultStringValue("(D)Open project in a new R session")
    String openProjectInNewWindowDesc();
    
    // Command: shareProject
    @DefaultStringValue("(D)Share Project...")
    String shareProjectLabel();
    @DefaultStringValue("(D)")
    String shareProjectButtonlabel();
    @DefaultStringValue("(D)S_hare Project...")
    String shareProjectMenulabel();
    @DefaultStringValue("(D)Share this project with others")
    String shareProjectDesc();
    
    // Command: openSharedProject
    @DefaultStringValue("(D)Open Shared Project")
    String openSharedProjectLabel();
    @DefaultStringValue("(D)More...")
    String openSharedProjectMenulabel();
    @DefaultStringValue("(D)Open a project shared with you")
    String openSharedProjectDesc();
    
    // Command: projectMru0
    
    // Command: projectMru1
    
    // Command: projectMru2
    
    // Command: projectMru3
    
    // Command: projectMru4
    
    // Command: projectMru5
    
    // Command: projectMru6
    
    // Command: projectMru7
    
    // Command: projectMru8
    
    // Command: projectMru9
    
    // Command: projectMru10
    
    // Command: projectMru11
    
    // Command: projectMru12
    
    // Command: projectMru13
    
    // Command: projectMru14
    
    // Command: clearRecentProjects
    @DefaultStringValue("(D)_Clear Project List")
    String clearRecentProjectsMenulabel();
    
    // Command: closeProject
    @DefaultStringValue("(D)Close Current Project")
    String closeProjectLabel();
    @DefaultStringValue("(D)")
    String closeProjectButtonlabel();
    @DefaultStringValue("(D)Close Projec_t")
    String closeProjectMenulabel();
    @DefaultStringValue("(D)Close the currently open project")
    String closeProjectDesc();
    
    // Command: projectOptions
    @DefaultStringValue("(D)Edit Project Options...")
    String projectOptionsLabel();
    @DefaultStringValue("(D)")
    String projectOptionsButtonlabel();
    @DefaultStringValue("(D)_Project Options...")
    String projectOptionsMenulabel();
    @DefaultStringValue("(D)Edit options for the current project")
    String projectOptionsDesc();
    
    // Command: projectSweaveOptions
    @DefaultStringValue("(D)")
    String projectSweaveOptionsButtonlabel();
    @DefaultStringValue("(D)")
    String projectSweaveOptionsMenulabel();
    @DefaultStringValue("(D)")
    String projectSweaveOptionsDesc();
    
    // Command: showToolbar
    @DefaultStringValue("(D)Show _Toolbar")
    String showToolbarMenulabel();
    
    // Command: hideToolbar
    @DefaultStringValue("(D)Hide _Toolbar")
    String hideToolbarMenulabel();
    
    // Command: toggleToolbar
    @DefaultStringValue("(D)Toggle Visibility of Toolbar")
    String toggleToolbarLabel();
    @DefaultStringValue("(D)Toggle Toolbar")
    String toggleToolbarMenulabel();
    
    // Command: zoomActualSize
    @DefaultStringValue("(D)Actual _Size")
    String zoomActualSizeMenulabel();
    
    // Command: zoomIn
    @DefaultStringValue("(D)_Zoom In")
    String zoomInMenulabel();
    
    // Command: zoomOut
    @DefaultStringValue("(D)Zoom O_ut")
    String zoomOutMenulabel();
    
    // Command: goToFileFunction
    @DefaultStringValue("(D)Go To File/Function...")
    String goToFileFunctionLabel();
    @DefaultStringValue("(D)Go To File/F_unction...")
    String goToFileFunctionMenulabel();
    
    // Command: switchFocusSourceConsole
    @DefaultStringValue("(D)Switch Focus between Source/Console")
    String switchFocusSourceConsoleLabel();
    
    // Command: activateSource
    @DefaultStringValue("(D)Move Focus to Source")
    String activateSourceLabel();
    @DefaultStringValue("(D)Move Focus to Sou_rce")
    String activateSourceMenulabel();
    
    // Command: activateConsolePane
    @DefaultStringValue("(D)Move Focus to Console Panel")
    String activateConsolePaneLabel();
    @DefaultStringValue("(D)Move Focus to _Console Panel")
    String activateConsolePaneMenulabel();
    
    // Command: activateConsole
    @DefaultStringValue("(D)Move Focus to Console")
    String activateConsoleLabel();
    @DefaultStringValue("(D)Move Focus to _Console")
    String activateConsoleMenulabel();
    
    // Command: activateEnvironment
    @DefaultStringValue("(D)Show Environment Pane")
    String activateEnvironmentLabel();
    @DefaultStringValue("(D)Show _Environment")
    String activateEnvironmentMenulabel();
    
    // Command: activateData
    @DefaultStringValue("(D)Show Data Pane")
    String activateDataLabel();
    @DefaultStringValue("(D)Show _Data")
    String activateDataMenulabel();
    
    // Command: activateHistory
    @DefaultStringValue("(D)Show History Pane")
    String activateHistoryLabel();
    @DefaultStringValue("(D)Show Histor_y")
    String activateHistoryMenulabel();
    
    // Command: activateFiles
    @DefaultStringValue("(D)Show Files Pane")
    String activateFilesLabel();
    @DefaultStringValue("(D)Show F_iles")
    String activateFilesMenulabel();
    
    // Command: activatePlots
    @DefaultStringValue("(D)Show Plots Pane")
    String activatePlotsLabel();
    @DefaultStringValue("(D)Show Pl_ots")
    String activatePlotsMenulabel();
    
    // Command: activatePackages
    @DefaultStringValue("(D)Show Packages Pane")
    String activatePackagesLabel();
    @DefaultStringValue("(D)Show Pac_kages")
    String activatePackagesMenulabel();
    
    // Command: activateHelp
    @DefaultStringValue("(D)Show Help Pane")
    String activateHelpLabel();
    @DefaultStringValue("(D)Move Focus to _Help")
    String activateHelpMenulabel();
    
    // Command: activateVcs
    @DefaultStringValue("(D)Show VCS Pane")
    String activateVcsLabel();
    @DefaultStringValue("(D)Show _Vcs")
    String activateVcsMenulabel();
    
    // Command: activateBuild
    @DefaultStringValue("(D)Show Build Pane")
    String activateBuildLabel();
    @DefaultStringValue("(D)Show _Build")
    String activateBuildMenulabel();
    
    // Command: activateViewer
    @DefaultStringValue("(D)Show Viewer Pane")
    String activateViewerLabel();
    @DefaultStringValue("(D)Show Vie_wer")
    String activateViewerMenulabel();
    
    // Command: activatePresentation
    @DefaultStringValue("(D)Show Presentation Pane")
    String activatePresentationLabel();
    @DefaultStringValue("(D)Show Prese_ntation")
    String activatePresentationMenulabel();
    
    // Command: activateConnections
    @DefaultStringValue("(D)Show Connections Pane")
    String activateConnectionsLabel();
    @DefaultStringValue("(D)Show Co_nnections")
    String activateConnectionsMenulabel();
    
    // Command: activateTutorial
    @DefaultStringValue("(D)Show Tutorial Pane")
    String activateTutorialLabel();
    @DefaultStringValue("(D)Show _Tutorial")
    String activateTutorialMenulabel();
    
    // Command: activateJobs
    @DefaultStringValue("(D)Show Jobs Pane")
    String activateJobsLabel();
    @DefaultStringValue("(D)Show _Jobs")
    String activateJobsMenulabel();
    
    // Command: activateLauncherJobs
    @DefaultStringValue("(D)Show Launcher Pane")
    String activateLauncherJobsLabel();
    @DefaultStringValue("(D)Show _Launcher")
    String activateLauncherJobsMenulabel();
    
    // Command: activateCompilePDF
    @DefaultStringValue("(D)Show Compile PDF Pane")
    String activateCompilePDFLabel();
    @DefaultStringValue("(D)Show Compile _PDF")
    String activateCompilePDFMenulabel();
    
    // Command: activateFindInFiles
    @DefaultStringValue("(D)Show Find in Files")
    String activateFindInFilesLabel();
    @DefaultStringValue("(D)Show _Find in Files")
    String activateFindInFilesMenulabel();
    
    // Command: activateSourceCpp
    @DefaultStringValue("(D)Show Source Cpp Pane")
    String activateSourceCppLabel();
    @DefaultStringValue("(D)Show Sou_rce Cpp")
    String activateSourceCppMenulabel();
    
    // Command: activateRMarkdown
    @DefaultStringValue("(D)Show R Markdown Pane")
    String activateRMarkdownLabel();
    @DefaultStringValue("(D)Show _R Markdown")
    String activateRMarkdownMenulabel();
    
    // Command: activateDeployContent
    @DefaultStringValue("(D)Show Deploy Content Pane")
    String activateDeployContentLabel();
    @DefaultStringValue("(D)Show Deploy _Content")
    String activateDeployContentMenulabel();
    
    // Command: activateMarkers
    @DefaultStringValue("(D)Show Markers Pane")
    String activateMarkersLabel();
    @DefaultStringValue("(D)Show _Markers")
    String activateMarkersMenulabel();
    
    // Command: activateSQLResults
    @DefaultStringValue("(D)Show SQL Results Pane")
    String activateSQLResultsLabel();
    @DefaultStringValue("(D)Show S_QL Results")
    String activateSQLResultsMenulabel();
    
    // Command: layoutZoomSource
    @DefaultStringValue("(D)Zoom Source")
    String layoutZoomSourceLabel();
    @DefaultStringValue("(D)Zoom Sou_rce")
    String layoutZoomSourceMenulabel();
    
    // Command: layoutZoomConsolePane
    @DefaultStringValue("(D)Zoom Console Pane")
    String layoutZoomConsolePaneLabel();
    @DefaultStringValue("(D)Zoom Console Pane")
    String layoutZoomConsolePaneMenulabel();
    
    // Command: layoutZoomConsole
    @DefaultStringValue("(D)Zoom Console")
    String layoutZoomConsoleLabel();
    @DefaultStringValue("(D)Zoom _Console")
    String layoutZoomConsoleMenulabel();
    
    // Command: layoutZoomEnvironment
    @DefaultStringValue("(D)Zoom Environment")
    String layoutZoomEnvironmentLabel();
    @DefaultStringValue("(D)Zoom _Environment")
    String layoutZoomEnvironmentMenulabel();
    
    // Command: layoutZoomHistory
    @DefaultStringValue("(D)Zoom History")
    String layoutZoomHistoryLabel();
    @DefaultStringValue("(D)Zoom Histor_y")
    String layoutZoomHistoryMenulabel();
    
    // Command: layoutZoomFiles
    @DefaultStringValue("(D)Zoom Files")
    String layoutZoomFilesLabel();
    @DefaultStringValue("(D)Zoom F_iles")
    String layoutZoomFilesMenulabel();
    
    // Command: layoutZoomPlots
    @DefaultStringValue("(D)Zoom Plots")
    String layoutZoomPlotsLabel();
    @DefaultStringValue("(D)Zoom Pl_ots")
    String layoutZoomPlotsMenulabel();
    
    // Command: layoutZoomPackages
    @DefaultStringValue("(D)Zoom Packages")
    String layoutZoomPackagesLabel();
    @DefaultStringValue("(D)Zoom P_ackages")
    String layoutZoomPackagesMenulabel();
    
    // Command: layoutZoomHelp
    @DefaultStringValue("(D)Zoom Help")
    String layoutZoomHelpLabel();
    @DefaultStringValue("(D)Zoom _Help")
    String layoutZoomHelpMenulabel();
    
    // Command: layoutZoomVcs
    @DefaultStringValue("(D)Zoom VCS")
    String layoutZoomVcsLabel();
    @DefaultStringValue("(D)Zoom _VCS")
    String layoutZoomVcsMenulabel();
    
    // Command: layoutZoomTutorial
    @DefaultStringValue("(D)Zoom Tutorial")
    String layoutZoomTutorialLabel();
    @DefaultStringValue("(D)Zoom _Tutorial")
    String layoutZoomTutorialMenulabel();
    
    // Command: layoutZoomBuild
    @DefaultStringValue("(D)Zoom Build")
    String layoutZoomBuildLabel();
    @DefaultStringValue("(D)Zoom _Build")
    String layoutZoomBuildMenulabel();
    
    // Command: layoutZoomViewer
    @DefaultStringValue("(D)Zoom Viewer")
    String layoutZoomViewerLabel();
    @DefaultStringValue("(D)Zoom Vie_wer")
    String layoutZoomViewerMenulabel();
    
    // Command: layoutZoomConnections
    @DefaultStringValue("(D)Zoom Connections")
    String layoutZoomConnectionsLabel();
    @DefaultStringValue("(D)Zoom Co_nnections")
    String layoutZoomConnectionsMenulabel();
    
    // Command: layoutZoomCurrentPane
    @DefaultStringValue("(D)Toggle Zoom for Current Pane")
    String layoutZoomCurrentPaneLabel();
    
    // Command: layoutEndZoom
    @DefaultStringValue("(D)Show All Panes")
    String layoutEndZoomLabel();
    @DefaultStringValue("(D)_Show All Panes")
    String layoutEndZoomMenulabel();
    
    // Command: newSourceColumn
    @DefaultStringValue("(D)Add Source Column")
    String newSourceColumnLabel();
    @DefaultStringValue("(D)_Add Source Column")
    String newSourceColumnMenulabel();
    
    // Command: layoutConsoleOnLeft
    @DefaultStringValue("(D)Console on Left")
    String layoutConsoleOnLeftLabel();
    @DefaultStringValue("(D)Console on _Left")
    String layoutConsoleOnLeftMenulabel();
    
    // Command: layoutConsoleOnRight
    @DefaultStringValue("(D)Console on Right")
    String layoutConsoleOnRightLabel();
    @DefaultStringValue("(D)Console on _Right")
    String layoutConsoleOnRightMenulabel();
    
    // Command: layoutZoomLeftColumn
    @DefaultStringValue("(D)Zoom Left / Center Column")
    String layoutZoomLeftColumnLabel();
    @DefaultStringValue("(D)_Zoom Left / Center Column")
    String layoutZoomLeftColumnMenulabel();
    
    // Command: layoutZoomRightColumn
    @DefaultStringValue("(D)Zoom Right Column")
    String layoutZoomRightColumnLabel();
    @DefaultStringValue("(D)Zoo_m Right Column")
    String layoutZoomRightColumnMenulabel();
    
    // Command: jumpTo
    @DefaultStringValue("(D)Jump To...")
    String jumpToLabel();
    @DefaultStringValue("(D)_Jump To...")
    String jumpToMenulabel();
    
    // Command: switchToTab
    @DefaultStringValue("(D)Switch to Tab...")
    String switchToTabLabel();
    @DefaultStringValue("(D)Switch to Ta_b...")
    String switchToTabMenulabel();
    
    // Command: previousTab
    @DefaultStringValue("(D)Open Previous Tab")
    String previousTabLabel();
    @DefaultStringValue("(D)_Previous Tab")
    String previousTabMenulabel();
    
    // Command: nextTab
    @DefaultStringValue("(D)Open Next Tab")
    String nextTabLabel();
    @DefaultStringValue("(D)_Next Tab")
    String nextTabMenulabel();
    
    // Command: firstTab
    @DefaultStringValue("(D)Open First Tab")
    String firstTabLabel();
    @DefaultStringValue("(D)_First Tab")
    String firstTabMenulabel();
    
    // Command: lastTab
    @DefaultStringValue("(D)Open Last Tab")
    String lastTabLabel();
    @DefaultStringValue("(D)_Last Tab")
    String lastTabMenulabel();
    
    // Command: moveTabLeft
    @DefaultStringValue("(D)Move Tab Left")
    String moveTabLeftLabel();
    @DefaultStringValue("(D)Move Tab Lef_t")
    String moveTabLeftMenulabel();
    
    // Command: moveTabRight
    @DefaultStringValue("(D)Move Tab Right")
    String moveTabRightLabel();
    @DefaultStringValue("(D)Move Tab _Right")
    String moveTabRightMenulabel();
    
    // Command: moveTabToFirst
    @DefaultStringValue("(D)Move Tab to First")
    String moveTabToFirstLabel();
    @DefaultStringValue("(D)Move Tab to _First")
    String moveTabToFirstMenulabel();
    
    // Command: moveTabToLast
    @DefaultStringValue("(D)Move Tab to Last")
    String moveTabToLastLabel();
    @DefaultStringValue("(D)Move Tab to La_st")
    String moveTabToLastMenulabel();
    
    // Command: goToLine
    @DefaultStringValue("(D)Go to Line...")
    String goToLineLabel();
    @DefaultStringValue("(D)_Go to Line...")
    String goToLineMenulabel();
    
    // Command: toggleFullScreen
    @DefaultStringValue("(D)Toggle _Full Screen")
    String toggleFullScreenMenulabel();
    
    // Command: findFromSelection
    @DefaultStringValue("(D)_Use Selection for Find")
    String findFromSelectionMenulabel();
    
    // Command: quickAddNext
    @DefaultStringValue("(D)Find and Add Next")
    String quickAddNextLabel();
    @DefaultStringValue("(D)Add")
    String quickAddNextButtonlabel();
    @DefaultStringValue("(D)Find and Add Next")
    String quickAddNextMenulabel();
    @DefaultStringValue("(D)Find and add next occurence")
    String quickAddNextDesc();
    
    // Command: findAll
    @DefaultStringValue("(D)Find All")
    String findAllLabel();
    
    // Command: findReplace
    @DefaultStringValue("(D)Find / Replace Text...")
    String findReplaceLabel();
    @DefaultStringValue("(D)_Find...")
    String findReplaceMenulabel();
    
    // Command: findNext
    @DefaultStringValue("(D)Find Next Occurence")
    String findNextLabel();
    @DefaultStringValue("(D)Next")
    String findNextButtonlabel();
    @DefaultStringValue("(D)Find _Next")
    String findNextMenulabel();
    @DefaultStringValue("(D)Find next occurrence")
    String findNextDesc();
    
    // Command: findPrevious
    @DefaultStringValue("(D)Find Previous Occurence")
    String findPreviousLabel();
    @DefaultStringValue("(D)Prev")
    String findPreviousButtonlabel();
    @DefaultStringValue("(D)Find Pre_vious")
    String findPreviousMenulabel();
    @DefaultStringValue("(D)Find previous occurrence")
    String findPreviousDesc();
    
    // Command: findSelectAll
    @DefaultStringValue("(D)Find and Select All")
    String findSelectAllLabel();
    @DefaultStringValue("(D)All")
    String findSelectAllButtonlabel();
    @DefaultStringValue("(D)Find And Select All")
    String findSelectAllMenulabel();
    @DefaultStringValue("(D)Find and select all matches")
    String findSelectAllDesc();
    
    // Command: replaceAndFind
    @DefaultStringValue("(D)Replace and Find Next")
    String replaceAndFindLabel();
    @DefaultStringValue("(D)Replace")
    String replaceAndFindButtonlabel();
    @DefaultStringValue("(D)_Replace and Find")
    String replaceAndFindMenulabel();
    @DefaultStringValue("(D)Replace and find next occurrence")
    String replaceAndFindDesc();
    
    // Command: findInFiles
    @DefaultStringValue("(D)Find _in Files...")
    String findInFilesMenulabel();
    
    // Command: fold
    @DefaultStringValue("(D)Collapse Fold")
    String foldLabel();
    @DefaultStringValue("(D)_Collapse")
    String foldMenulabel();
    
    // Command: unfold
    @DefaultStringValue("(D)Expand Fold")
    String unfoldLabel();
    @DefaultStringValue("(D)E_xpand")
    String unfoldMenulabel();
    
    // Command: foldAll
    @DefaultStringValue("(D)Collapse All Folds")
    String foldAllLabel();
    @DefaultStringValue("(D)Collapse _All")
    String foldAllMenulabel();
    
    // Command: unfoldAll
    @DefaultStringValue("(D)Expand All Folds")
    String unfoldAllLabel();
    @DefaultStringValue("(D)Ex_pand All")
    String unfoldAllMenulabel();
    
    // Command: jumpToMatching
    @DefaultStringValue("(D)Jump to Matching Bracket")
    String jumpToMatchingLabel();
    @DefaultStringValue("(D)Jump To _Matching")
    String jumpToMatchingMenulabel();
    @DefaultStringValue("(D)Jump to matching bracket")
    String jumpToMatchingDesc();
    
    // Command: expandToMatching
    @DefaultStringValue("(D)Expand to Matching Bracket")
    String expandToMatchingLabel();
    @DefaultStringValue("(D)Expand To _Matching")
    String expandToMatchingMenulabel();
    @DefaultStringValue("(D)Expand selection to matching bracket")
    String expandToMatchingDesc();
    
    // Command: addCursorAbove
    @DefaultStringValue("(D)Add Cursor Above Current Cursor")
    String addCursorAboveMenulabel();
    
    // Command: addCursorBelow
    @DefaultStringValue("(D)Add Cursor Below Current Cursor")
    String addCursorBelowMenulabel();
    
    // Command: moveLinesUp
    @DefaultStringValue("(D)Move Lines Up")
    String moveLinesUpMenulabel();
    
    // Command: moveLinesDown
    @DefaultStringValue("(D)Move Lines Down")
    String moveLinesDownMenulabel();
    
    // Command: expandToLine
    @DefaultStringValue("(D)Expand Selection to Line")
    String expandToLineMenulabel();
    
    // Command: copyLinesDown
    @DefaultStringValue("(D)Copy Lines Down")
    String copyLinesDownMenulabel();
    
    // Command: joinLines
    @DefaultStringValue("(D)Join Lines")
    String joinLinesMenulabel();
    
    // Command: removeLine
    @DefaultStringValue("(D)Remove Line")
    String removeLineMenulabel();
    
    // Command: splitIntoLines
    @DefaultStringValue("(D)Split Into Lines")
    String splitIntoLinesMenulabel();
    @DefaultStringValue("(D)Create a new cursor on each line in current selection")
    String splitIntoLinesDesc();
    
    // Command: editLinesFromStart
    @DefaultStringValue("(D)Edit Lines from Start")
    String editLinesFromStartMenulabel();
    @DefaultStringValue("(D)Create a new cursor at start of each line in selection")
    String editLinesFromStartDesc();
    
    // Command: executeAllCode
    @DefaultStringValue("(D)Run All Code in Current Source File")
    String executeAllCodeLabel();
    @DefaultStringValue("(D)")
    String executeAllCodeButtonlabel();
    @DefaultStringValue("(D)Run _All")
    String executeAllCodeMenulabel();
    @DefaultStringValue("(D)Run all of the code in the source file")
    String executeAllCodeDesc();
    
    // Command: executeCode
    @DefaultStringValue("(D)Run Current Line or Selection")
    String executeCodeLabel();
    @DefaultStringValue("(D)Run")
    String executeCodeButtonlabel();
    @DefaultStringValue("(D)Run Selected _Line(s)")
    String executeCodeMenulabel();
    @DefaultStringValue("(D)Run the current line or selection")
    String executeCodeDesc();
    
    // Command: executeCodeWithoutMovingCursor
    @DefaultStringValue("(D)Run Current Line or Selection (Without Moving Cursor)")
    String executeCodeWithoutMovingCursorLabel();
    @DefaultStringValue("(D)Run")
    String executeCodeWithoutMovingCursorButtonlabel();
    @DefaultStringValue("(D)Run _Line(s) without moving cursor")
    String executeCodeWithoutMovingCursorMenulabel();
    @DefaultStringValue("(D)Run the current line or selection without moving the cursor")
    String executeCodeWithoutMovingCursorDesc();
    
    // Command: executeCodeWithoutFocus
    
    // Command: executeToCurrentLine
    @DefaultStringValue("(D)Execute Code up to Current Line")
    String executeToCurrentLineLabel();
    @DefaultStringValue("(D)Run From _Beginning To Line")
    String executeToCurrentLineMenulabel();
    @DefaultStringValue("(D)Run from the beginning of the source file up through the current line")
    String executeToCurrentLineDesc();
    
    // Command: executeFromCurrentLine
    @DefaultStringValue("(D)Execute Code From Current Line to End of Document")
    String executeFromCurrentLineLabel();
    @DefaultStringValue("(D)Run From Line to _End")
    String executeFromCurrentLineMenulabel();
    @DefaultStringValue("(D)Run from the current line through the end of the source file")
    String executeFromCurrentLineDesc();
    
    // Command: executeCurrentFunction
    @DefaultStringValue("(D)Run Current Function Definition")
    String executeCurrentFunctionLabel();
    @DefaultStringValue("(D)Run _Function Definition")
    String executeCurrentFunctionMenulabel();
    @DefaultStringValue("(D)Run the top-level function definition, if any, that contains the cursor")
    String executeCurrentFunctionDesc();
    
    // Command: executeCurrentSection
    @DefaultStringValue("(D)Execute Current Code Section")
    String executeCurrentSectionLabel();
    @DefaultStringValue("(D)Run Section")
    String executeCurrentSectionButtonlabel();
    @DefaultStringValue("(D)Run Code _Section")
    String executeCurrentSectionMenulabel();
    @DefaultStringValue("(D)Run the code section that contains the cursor")
    String executeCurrentSectionDesc();
    
    // Command: executeLastCode
    @DefaultStringValue("(D)Re-Run Previous Code Execution")
    String executeLastCodeLabel();
    @DefaultStringValue("(D)")
    String executeLastCodeButtonlabel();
    @DefaultStringValue("(D)Re-Run _Previous")
    String executeLastCodeMenulabel();
    @DefaultStringValue("(D)Re-run the previous code region")
    String executeLastCodeDesc();
    
    // Command: executeCurrentLine
    @DefaultStringValue("(D)Execute Current Line")
    String executeCurrentLineLabel();
    @DefaultStringValue("(D)Execute Current _Line")
    String executeCurrentLineMenulabel();
    @DefaultStringValue("(D)Execute the line which contains the cursor")
    String executeCurrentLineDesc();
    
    // Command: executeCurrentStatement
    @DefaultStringValue("(D)Execute Current Statement")
    String executeCurrentStatementLabel();
    @DefaultStringValue("(D)Execute Current _Statement")
    String executeCurrentStatementMenulabel();
    @DefaultStringValue("(D)Execute the entire R statement which contains the cursor.")
    String executeCurrentStatementDesc();
    
    // Command: executeCurrentParagraph
    @DefaultStringValue("(D)Execute Current Paragraph")
    String executeCurrentParagraphLabel();
    @DefaultStringValue("(D)Execute Current _Paragraph")
    String executeCurrentParagraphMenulabel();
    @DefaultStringValue("(D)Execute the current paragraph of code, delimited by blank lines.")
    String executeCurrentParagraphDesc();
    
    // Command: insertChunk
    @DefaultStringValue("(D)_Insert Chunk")
    String insertChunkMenulabel();
    @DefaultStringValue("(D)Insert a new code chunk")
    String insertChunkDesc();
    
    // Command: insertChunkR
    @DefaultStringValue("(D)R")
    String insertChunkRMenulabel();
    @DefaultStringValue("(D)Insert a new R chunk")
    String insertChunkRDesc();
    
    // Command: insertChunkBash
    @DefaultStringValue("(D)Bash")
    String insertChunkBashMenulabel();
    @DefaultStringValue("(D)Insert a new Bash chunk")
    String insertChunkBashDesc();
    
    // Command: insertChunkD3
    @DefaultStringValue("(D)D3")
    String insertChunkD3Menulabel();
    @DefaultStringValue("(D)Insert a new D3 chunk")
    String insertChunkD3Desc();
    
    // Command: insertChunkPython
    @DefaultStringValue("(D)Python")
    String insertChunkPythonMenulabel();
    @DefaultStringValue("(D)Insert a new Python chunk")
    String insertChunkPythonDesc();
    
    // Command: insertChunkRCPP
    @DefaultStringValue("(D)Rcpp")
    String insertChunkRCPPMenulabel();
    @DefaultStringValue("(D)Insert a new Rcpp chunk")
    String insertChunkRCPPDesc();
    
    // Command: insertChunkStan
    @DefaultStringValue("(D)Stan")
    String insertChunkStanMenulabel();
    @DefaultStringValue("(D)Insert a new Stan chunk")
    String insertChunkStanDesc();
    
    // Command: insertChunkSQL
    @DefaultStringValue("(D)SQL")
    String insertChunkSQLMenulabel();
    @DefaultStringValue("(D)Insert a new SQL chunk")
    String insertChunkSQLDesc();
    
    // Command: switchToChunkR
    @DefaultStringValue("(D)R")
    String switchToChunkRMenulabel();
    @DefaultStringValue("(D)Switch chunk to R")
    String switchToChunkRDesc();
    
    // Command: switchToChunkBash
    @DefaultStringValue("(D)Bash")
    String switchToChunkBashMenulabel();
    @DefaultStringValue("(D)Switch chunk to Bash")
    String switchToChunkBashDesc();
    
    // Command: switchToChunkPython
    @DefaultStringValue("(D)Python")
    String switchToChunkPythonMenulabel();
    @DefaultStringValue("(D)Switch chunk to Python")
    String switchToChunkPythonDesc();
    
    // Command: switchToChunkRCPP
    @DefaultStringValue("(D)Rcpp")
    String switchToChunkRCPPMenulabel();
    @DefaultStringValue("(D)Switch chunk to Rcpp")
    String switchToChunkRCPPDesc();
    
    // Command: switchToChunkStan
    @DefaultStringValue("(D)Stan")
    String switchToChunkStanMenulabel();
    @DefaultStringValue("(D)Switch chunk to Stan")
    String switchToChunkStanDesc();
    
    // Command: switchToChunkSQL
    @DefaultStringValue("(D)SQL")
    String switchToChunkSQLMenulabel();
    @DefaultStringValue("(D)Switch chunk to SQL")
    String switchToChunkSQLDesc();
    
    // Command: insertSection
    @DefaultStringValue("(D)_Insert Section...")
    String insertSectionMenulabel();
    @DefaultStringValue("(D)Insert a new code section")
    String insertSectionDesc();
    
    // Command: executePreviousChunks
    @DefaultStringValue("(D)_Run All Chunks Above")
    String executePreviousChunksMenulabel();
    @DefaultStringValue("(D)Run all chunks above the current one")
    String executePreviousChunksDesc();
    
    // Command: executeSubsequentChunks
    @DefaultStringValue("(D)Run All C_hunks Below")
    String executeSubsequentChunksMenulabel();
    @DefaultStringValue("(D)Run all chunks below the current one")
    String executeSubsequentChunksDesc();
    
    // Command: executeCurrentChunk
    @DefaultStringValue("(D)Run _Current Chunk")
    String executeCurrentChunkMenulabel();
    @DefaultStringValue("(D)Run the current code chunk")
    String executeCurrentChunkDesc();
    
    // Command: executeNextChunk
    @DefaultStringValue("(D)Run _Next Chunk")
    String executeNextChunkMenulabel();
    @DefaultStringValue("(D)Run the next code chunk")
    String executeNextChunkDesc();
    
    // Command: executeSetupChunk
    @DefaultStringValue("(D)Run _Setup Chunk")
    String executeSetupChunkMenulabel();
    @DefaultStringValue("(D)Run the initial setup chunk")
    String executeSetupChunkDesc();
    
    // Command: goToHelp
    @DefaultStringValue("(D)Show Help for Current Function")
    String goToHelpLabel();
    @DefaultStringValue("(D)Go To _Help")
    String goToHelpMenulabel();
    @DefaultStringValue("(D)Go to help for the currently selected function")
    String goToHelpDesc();
    
    // Command: goToDefinition
    @DefaultStringValue("(D)_Go To Function Definition")
    String goToDefinitionMenulabel();
    @DefaultStringValue("(D)Go to to the definition of the currently selected function")
    String goToDefinitionDesc();
    
    // Command: codeCompletion
    @DefaultStringValue("(D)Retrieve Completions")
    String codeCompletionLabel();
    @DefaultStringValue("(D)Code Completion")
    String codeCompletionMenulabel();
    @DefaultStringValue("(D)Show code completions at the current cursor location")
    String codeCompletionDesc();
    
    // Command: sourceNavigateBack
    @DefaultStringValue("(D)Bac_k")
    String sourceNavigateBackMenulabel();
    @DefaultStringValue("(D)Go back to the previous source location")
    String sourceNavigateBackDesc();
    
    // Command: sourceNavigateForward
    @DefaultStringValue("(D)For_ward")
    String sourceNavigateForwardMenulabel();
    @DefaultStringValue("(D)Go forward to the next source location")
    String sourceNavigateForwardDesc();
    
    // Command: extractFunction
    @DefaultStringValue("(D)E_xtract Function")
    String extractFunctionMenulabel();
    @DefaultStringValue("(D)Turn the current selection into a function")
    String extractFunctionDesc();
    
    // Command: extractLocalVariable
    @DefaultStringValue("(D)Extract _Variable")
    String extractLocalVariableMenulabel();
    @DefaultStringValue("(D)Extract a variable out of the current selection")
    String extractLocalVariableDesc();
    
    // Command: findUsages
    @DefaultStringValue("(D)Find _Usages")
    String findUsagesMenulabel();
    @DefaultStringValue("(D)Find source locations where this symbol is used")
    String findUsagesDesc();
    
    // Command: sourceFile
    @DefaultStringValue("(D)")
    String sourceFileButtonlabel();
    @DefaultStringValue("(D)Source _File...")
    String sourceFileMenulabel();
    @DefaultStringValue("(D)Source the contents of an R file")
    String sourceFileDesc();
    
    // Command: previewJS
    @DefaultStringValue("(D)Preview")
    String previewJSButtonlabel();
    @DefaultStringValue("(D)Preview J_S")
    String previewJSMenulabel();
    @DefaultStringValue("(D)Preview the active JavaScript document")
    String previewJSDesc();
    
    // Command: previewSql
    @DefaultStringValue("(D)Preview")
    String previewSqlButtonlabel();
    @DefaultStringValue("(D)Preview S_QL")
    String previewSqlMenulabel();
    @DefaultStringValue("(D)Preview the active SQL document")
    String previewSqlDesc();
    
    // Command: sourceActiveDocument
    @DefaultStringValue("(D)Source")
    String sourceActiveDocumentButtonlabel();
    @DefaultStringValue("(D)_Source")
    String sourceActiveDocumentMenulabel();
    @DefaultStringValue("(D)Source the contents of the active document")
    String sourceActiveDocumentDesc();
    
    // Command: sourceActiveDocumentWithEcho
    @DefaultStringValue("(D)")
    String sourceActiveDocumentWithEchoButtonlabel();
    @DefaultStringValue("(D)Source with _Echo")
    String sourceActiveDocumentWithEchoMenulabel();
    @DefaultStringValue("(D)Source the contents of the active document (with echo)")
    String sourceActiveDocumentWithEchoDesc();
    
    // Command: commentUncomment
    @DefaultStringValue("(D)Comment / Uncomment Selection")
    String commentUncommentLabel();
    @DefaultStringValue("(D)_Comment/Uncomment Lines")
    String commentUncommentMenulabel();
    @DefaultStringValue("(D)Comment or uncomment the current line/selection")
    String commentUncommentDesc();
    
    // Command: reformatCode
    @DefaultStringValue("(D)Reformat Current Selection")
    String reformatCodeLabel();
    @DefaultStringValue("(D)Re_format Code")
    String reformatCodeMenulabel();
    @DefaultStringValue("(D)Reformat the current line/selection")
    String reformatCodeDesc();
    
    // Command: showDiagnosticsActiveDocument
    @DefaultStringValue("(D)Show Diagnostics for Current Document")
    String showDiagnosticsActiveDocumentLabel();
    @DefaultStringValue("(D)Show _Diagnostics")
    String showDiagnosticsActiveDocumentMenulabel();
    @DefaultStringValue("(D)Show diagnostics for the active document")
    String showDiagnosticsActiveDocumentDesc();
    
    // Command: showDiagnosticsProject
    @DefaultStringValue("(D)Show Diagnostics for Current Project")
    String showDiagnosticsProjectLabel();
    @DefaultStringValue("(D)Show Diagnostics (Projec_t)")
    String showDiagnosticsProjectMenulabel();
    @DefaultStringValue("(D)Show diagnostics for all source files in the current project")
    String showDiagnosticsProjectDesc();
    
    // Command: reindent
    @DefaultStringValue("(D)Reindent Selection")
    String reindentLabel();
    @DefaultStringValue("(D)_Reindent Lines")
    String reindentMenulabel();
    @DefaultStringValue("(D)Reindent the current line/selection")
    String reindentDesc();
    
    // Command: reflowComment
    @DefaultStringValue("(D)Reflow Co_mment")
    String reflowCommentMenulabel();
    @DefaultStringValue("(D)Reflow selected comment lines so they wrap evenly")
    String reflowCommentDesc();
    
    // Command: renameInScope
    @DefaultStringValue("(D)Rename Symbol in Scope")
    String renameInScopeLabel();
    @DefaultStringValue("(D)Ren_ame in Scope")
    String renameInScopeMenulabel();
    @DefaultStringValue("(D)Rename symbol in current scope")
    String renameInScopeDesc();
    
    // Command: insertSnippet
    @DefaultStringValue("(D)Insert Snippet")
    String insertSnippetMenulabel();
    @DefaultStringValue("(D)Expand snippet at cursor")
    String insertSnippetDesc();
    
    // Command: insertRoxygenSkeleton
    @DefaultStringValue("(D)Insert Ro_xygen Skeleton")
    String insertRoxygenSkeletonMenulabel();
    @DefaultStringValue("(D)Insert a roxygen comment for the current function")
    String insertRoxygenSkeletonDesc();
    
    // Command: expandSelection
    @DefaultStringValue("(D)Expand Selection")
    String expandSelectionMenulabel();
    @DefaultStringValue("(D)Expand selection")
    String expandSelectionDesc();
    
    // Command: shrinkSelection
    @DefaultStringValue("(D)Shrink Selection")
    String shrinkSelectionMenulabel();
    @DefaultStringValue("(D)Shrink selection")
    String shrinkSelectionDesc();
    
    // Command: goToNextSection
    @DefaultStringValue("(D)Go to Next Section")
    String goToNextSectionLabel();
    @DefaultStringValue("(D)")
    String goToNextSectionButtonlabel();
    @DefaultStringValue("(D)Go to next section/chunk")
    String goToNextSectionDesc();
    
    // Command: goToPrevSection
    @DefaultStringValue("(D)Go to Previous Section")
    String goToPrevSectionLabel();
    @DefaultStringValue("(D)")
    String goToPrevSectionButtonlabel();
    @DefaultStringValue("(D)Go to previous section/chunk")
    String goToPrevSectionDesc();
    
    // Command: goToStartOfCurrentScope
    
    // Command: goToEndOfCurrentScope
    
    // Command: goToNextChunk
    @DefaultStringValue("(D)Go to Next Chunk")
    String goToNextChunkLabel();
    @DefaultStringValue("(D)Go to next chunk")
    String goToNextChunkDesc();
    
    // Command: goToPrevChunk
    @DefaultStringValue("(D)Go to Previous Chunk")
    String goToPrevChunkLabel();
    @DefaultStringValue("(D)Go to previous chunk")
    String goToPrevChunkDesc();
    
    // Command: expandRaggedSelection
    @DefaultStringValue("(D)Expand Ragged Selection")
    String expandRaggedSelectionLabel();
    
    // Command: markdownHelp
    @DefaultStringValue("(D)Open Markdown Quick Reference")
    String markdownHelpLabel();
    @DefaultStringValue("(D)_Markdown Quick Reference")
    String markdownHelpMenulabel();
    @DefaultStringValue("(D)Markdown quick reference")
    String markdownHelpDesc();
    
    // Command: openRoxygenQuickReference
    @DefaultStringValue("(D)_Roxygen Quick Reference")
    String openRoxygenQuickReferenceMenulabel();
    @DefaultStringValue("(D)Roxygen quick reference")
    String openRoxygenQuickReferenceDesc();
    
    // Command: toggleDocumentOutline
    @DefaultStringValue("(D)Toggle Document Outline")
    String toggleDocumentOutlineLabel();
    @DefaultStringValue("(D)_Show Document Outline")
    String toggleDocumentOutlineMenulabel();
    @DefaultStringValue("(D)Show document outline")
    String toggleDocumentOutlineDesc();
    
    // Command: toggleRmdVisualMode
    @DefaultStringValue("(D)Toggle Visual Markdown Editor")
    String toggleRmdVisualModeLabel();
    @DefaultStringValue("(D)_Use Visual Editor")
    String toggleRmdVisualModeMenulabel();
    @DefaultStringValue("(D)Toggle visual markdown editor")
    String toggleRmdVisualModeDesc();
    
    // Command: enableProsemirrorDevTools
    @DefaultStringValue("(D)Enable Prosemirror DevTools")
    String enableProsemirrorDevToolsLabel();
    @DefaultStringValue("(D)_Prosemirror DevTools")
    String enableProsemirrorDevToolsMenulabel();
    @DefaultStringValue("(D)Enable Prosemirror DevTools")
    String enableProsemirrorDevToolsDesc();
    
    // Command: usingRMarkdownHelp
    @DefaultStringValue("(D)_Using R Markdown")
    String usingRMarkdownHelpMenulabel();
    @DefaultStringValue("(D)Guide to using R Markdown")
    String usingRMarkdownHelpDesc();
    
    // Command: authoringRPresentationsHelp
    @DefaultStringValue("(D)_Authoring R Presentations")
    String authoringRPresentationsHelpMenulabel();
    @DefaultStringValue("(D)Guide to using R Markdown")
    String authoringRPresentationsHelpDesc();
    
    // Command: openRStudioIDECheatSheet
    @DefaultStringValue("(D)_RStudio IDE Cheat Sheet")
    String openRStudioIDECheatSheetMenulabel();
    @DefaultStringValue("(D)RStudio IDE cheat sheet")
    String openRStudioIDECheatSheetDesc();
    
    // Command: openDataVisualizationCheatSheet
    @DefaultStringValue("(D)Data Visualization with _ggplot2")
    String openDataVisualizationCheatSheetMenulabel();
    @DefaultStringValue("(D)Data visualization with ggplot2")
    String openDataVisualizationCheatSheetDesc();
    
    // Command: openPurrrCheatSheet
    @DefaultStringValue("(D)List manipulation with _purrr")
    String openPurrrCheatSheetMenulabel();
    @DefaultStringValue("(D)List manipulation with purrr")
    String openPurrrCheatSheetDesc();
    
    // Command: openPackageDevelopmentCheatSheet
    @DefaultStringValue("(D)Package De_velopment with devtools")
    String openPackageDevelopmentCheatSheetMenulabel();
    @DefaultStringValue("(D)Package development with devtools")
    String openPackageDevelopmentCheatSheetDesc();
    
    // Command: openDataImportCheatSheet
    @DefaultStringValue("(D)_Import Data with readr")
    String openDataImportCheatSheetMenulabel();
    @DefaultStringValue("(D)Import data with readr")
    String openDataImportCheatSheetDesc();
    
    // Command: openDataWranglingCheatSheet
    @DefaultStringValue("(D)Data Manipulation with dplyr, tid_yr")
    String openDataWranglingCheatSheetMenulabel();
    @DefaultStringValue("(D)Data manipulation with dplyr and tidyr")
    String openDataWranglingCheatSheetDesc();
    
    // Command: openDataTransformationCheatSheet
    @DefaultStringValue("(D)Data Transformation with _dplyr")
    String openDataTransformationCheatSheetMenulabel();
    @DefaultStringValue("(D)Data transformation with dplyr")
    String openDataTransformationCheatSheetDesc();
    
    // Command: openSparklyrCheatSheet
    @DefaultStringValue("(D)Interfacing Spar_k with sparklyr")
    String openSparklyrCheatSheetMenulabel();
    @DefaultStringValue("(D)Interfacing Apache Spark with sparklyr")
    String openSparklyrCheatSheetDesc();
    
    // Command: openRMarkdownCheatSheet
    @DefaultStringValue("(D)R _Markdown Cheat Sheet")
    String openRMarkdownCheatSheetMenulabel();
    @DefaultStringValue("(D)R Markdown cheat sheet")
    String openRMarkdownCheatSheetDesc();
    
    // Command: openRMarkdownReferenceGuide
    @DefaultStringValue("(D)R Markdo_wn Reference Guide")
    String openRMarkdownReferenceGuideMenulabel();
    @DefaultStringValue("(D)R Markdown reference guide")
    String openRMarkdownReferenceGuideDesc();
    
    // Command: openShinyCheatSheet
    @DefaultStringValue("(D)Web Applications with _shiny")
    String openShinyCheatSheetMenulabel();
    @DefaultStringValue("(D)Build web applications with Shiny")
    String openShinyCheatSheetDesc();
    
    // Command: browseCheatSheets
    @DefaultStringValue("(D)_Browse Cheatsheets...")
    String browseCheatSheetsMenulabel();
    @DefaultStringValue("(D)Browse available cheatsheets in your web browser")
    String browseCheatSheetsDesc();
    
    // Command: knitDocument
    @DefaultStringValue("(D)Knit Current Document")
    String knitDocumentLabel();
    @DefaultStringValue("(D)Knit")
    String knitDocumentButtonlabel();
    @DefaultStringValue("(D)_Knit Document")
    String knitDocumentMenulabel();
    @DefaultStringValue("(D)Knit the current document")
    String knitDocumentDesc();
    
    // Command: previewHTML
    @DefaultStringValue("(D)Preview Document as HTML")
    String previewHTMLLabel();
    @DefaultStringValue("(D)Preview")
    String previewHTMLButtonlabel();
    @DefaultStringValue("(D)Previe_w")
    String previewHTMLMenulabel();
    @DefaultStringValue("(D)Show a preview of the current document as HTML")
    String previewHTMLDesc();
    
    // Command: publishHTML
    @DefaultStringValue("(D)Publish to RPubs...")
    String publishHTMLLabel();
    @DefaultStringValue("(D)Publish")
    String publishHTMLButtonlabel();
    @DefaultStringValue("(D)P_ublish to RPubs...")
    String publishHTMLMenulabel();
    @DefaultStringValue("(D)Publish the current document")
    String publishHTMLDesc();
    
    // Command: compilePDF
    @DefaultStringValue("(D)Compile to PDF...")
    String compilePDFLabel();
    @DefaultStringValue("(D)Compile PDF")
    String compilePDFButtonlabel();
    @DefaultStringValue("(D)_Compile PDF")
    String compilePDFMenulabel();
    @DefaultStringValue("(D)Compile a PDF from the current LaTeX or Sweave document")
    String compilePDFDesc();
    
    // Command: compileNotebook
    @DefaultStringValue("(D)_Compile Report...")
    String compileNotebookMenulabel();
    @DefaultStringValue("(D)Compile a report from the current R script")
    String compileNotebookDesc();
    
    // Command: editRmdFormatOptions
    @DefaultStringValue("(D)_Output Options...")
    String editRmdFormatOptionsMenulabel();
    @DefaultStringValue("(D)Edit the R Markdown format options for the current file")
    String editRmdFormatOptionsDesc();
    
    // Command: knitWithParameters
    @DefaultStringValue("(D)Knit with Parameters...")
    String knitWithParametersLabel();
    @DefaultStringValue("(D)Knit _with Parameters...")
    String knitWithParametersMenulabel();
    @DefaultStringValue("(D)Knit the document with a set of custom parameters")
    String knitWithParametersDesc();
    
    // Command: clearKnitrCache
    @DefaultStringValue("(D)Clear Knitr Cache...")
    String clearKnitrCacheMenulabel();
    @DefaultStringValue("(D)Clear the knitr cache for the current document")
    String clearKnitrCacheDesc();
    
    // Command: clearPrerenderedOutput
    @DefaultStringValue("(D)Clear Prerendered Output...")
    String clearPrerenderedOutputMenulabel();
    @DefaultStringValue("(D)Clear the prerendered output for the current document")
    String clearPrerenderedOutputDesc();
    
    // Command: notebookExpandAllOutput
    @DefaultStringValue("(D)")
    String notebookExpandAllOutputButtonlabel();
    @DefaultStringValue("(D)E_xpand All Output")
    String notebookExpandAllOutputMenulabel();
    @DefaultStringValue("(D)Expand all code chunk output in the current file")
    String notebookExpandAllOutputDesc();
    
    // Command: notebookToggleExpansion
    @DefaultStringValue("(D)")
    String notebookToggleExpansionButtonlabel();
    @DefaultStringValue("(D)Toggle Chunk Output Expansion")
    String notebookToggleExpansionMenulabel();
    @DefaultStringValue("(D)Expand or collapse the output of the current notebook chunk")
    String notebookToggleExpansionDesc();
    
    // Command: notebookCollapseAllOutput
    @DefaultStringValue("(D)")
    String notebookCollapseAllOutputButtonlabel();
    @DefaultStringValue("(D)Collapse All _Output")
    String notebookCollapseAllOutputMenulabel();
    @DefaultStringValue("(D)Collapse all code chunk output in the current file")
    String notebookCollapseAllOutputDesc();
    
    // Command: notebookClearOutput
    @DefaultStringValue("(D)")
    String notebookClearOutputButtonlabel();
    @DefaultStringValue("(D)Cl_ear Output")
    String notebookClearOutputMenulabel();
    @DefaultStringValue("(D)Clear the output of the current notebook chunk")
    String notebookClearOutputDesc();
    
    // Command: notebookClearAllOutput
    @DefaultStringValue("(D)")
    String notebookClearAllOutputButtonlabel();
    @DefaultStringValue("(D)Clear A_ll Output")
    String notebookClearAllOutputMenulabel();
    @DefaultStringValue("(D)Remove all code chunk output in the current file")
    String notebookClearAllOutputDesc();
    
    // Command: synctexSearch
    @DefaultStringValue("(D)")
    String synctexSearchButtonlabel();
    @DefaultStringValue("(D)S_ync PDF View to Editor")
    String synctexSearchMenulabel();
    @DefaultStringValue("(D)Sync PDF view to editor location (Ctrl+Click)")
    String synctexSearchDesc();
    
    // Command: checkSpelling
    @DefaultStringValue("(D)Check _Spelling...")
    String checkSpellingMenulabel();
    @DefaultStringValue("(D)Check spelling in document")
    String checkSpellingDesc();
    
    // Command: wordCount
    @DefaultStringValue("(D)_Word Count")
    String wordCountMenulabel();
    @DefaultStringValue("(D)Count words in selection or document")
    String wordCountDesc();
    
    // Command: newFolder
    @DefaultStringValue("(D)Create a New Folder...")
    String newFolderLabel();
    @DefaultStringValue("(D)New Folder")
    String newFolderButtonlabel();
    @DefaultStringValue("(D)Folder...")
    String newFolderMenulabel();
    @DefaultStringValue("(D)Create a new folder")
    String newFolderDesc();
    
    // Command: uploadFile
    @DefaultStringValue("(D)Upload Files...")
    String uploadFileLabel();
    @DefaultStringValue("(D)Upload")
    String uploadFileButtonlabel();
    @DefaultStringValue("(D)Upload Files...")
    String uploadFileMenulabel();
    @DefaultStringValue("(D)Upload files to server")
    String uploadFileDesc();
    
    // Command: copyFile
    @DefaultStringValue("(D)Copy Files...")
    String copyFileLabel();
    @DefaultStringValue("(D)Copy")
    String copyFileButtonlabel();
    @DefaultStringValue("(D)Copy...")
    String copyFileMenulabel();
    @DefaultStringValue("(D)Copy selected file or folder")
    String copyFileDesc();
    
    // Command: copyFileTo
    @DefaultStringValue("(D)Copy Files To...")
    String copyFileToLabel();
    @DefaultStringValue("(D)Copy To")
    String copyFileToButtonlabel();
    @DefaultStringValue("(D)Copy To...")
    String copyFileToMenulabel();
    @DefaultStringValue("(D)Copy selected file or folder to another folder")
    String copyFileToDesc();
    
    // Command: moveFiles
    @DefaultStringValue("(D)Move Files...")
    String moveFilesLabel();
    @DefaultStringValue("(D)Move")
    String moveFilesButtonlabel();
    @DefaultStringValue("(D)Move...")
    String moveFilesMenulabel();
    @DefaultStringValue("(D)Move selected files or folders")
    String moveFilesDesc();
    
    // Command: exportFiles
    @DefaultStringValue("(D)Export Files...")
    String exportFilesLabel();
    @DefaultStringValue("(D)Export")
    String exportFilesButtonlabel();
    @DefaultStringValue("(D)Export...")
    String exportFilesMenulabel();
    @DefaultStringValue("(D)Export selected files or folders")
    String exportFilesDesc();
    
    // Command: renameFile
    @DefaultStringValue("(D)Rename Current File...")
    String renameFileLabel();
    @DefaultStringValue("(D)Rename")
    String renameFileButtonlabel();
    @DefaultStringValue("(D)Rename selected file or folder")
    String renameFileDesc();
    
    // Command: deleteFiles
    @DefaultStringValue("(D)Delete Files...")
    String deleteFilesLabel();
    @DefaultStringValue("(D)Delete")
    String deleteFilesButtonlabel();
    @DefaultStringValue("(D)Delete selected files or folders")
    String deleteFilesDesc();
    
    // Command: refreshFiles
    @DefaultStringValue("(D)Refresh")
    String refreshFilesMenulabel();
    @DefaultStringValue("(D)Refresh file listing")
    String refreshFilesDesc();
    
    // Command: goToWorkingDir
    @DefaultStringValue("(D)")
    String goToWorkingDirButtonlabel();
    @DefaultStringValue("(D)Go To Working Directory")
    String goToWorkingDirMenulabel();
    @DefaultStringValue("(D)View the current working directory")
    String goToWorkingDirDesc();
    
    // Command: setAsWorkingDir
    @DefaultStringValue("(D)Set As Working Directory")
    String setAsWorkingDirLabel();
    
    // Command: copyFilesPaneCurrentDirectory
    @DefaultStringValue("(D)Copy Folder Path to Clipboard")
    String copyFilesPaneCurrentDirectoryLabel();
    
    // Command: showFolder
    @DefaultStringValue("(D)Show Folder in New Window")
    String showFolderLabel();
    
    // Command: vcsAddFiles
    @DefaultStringValue("(D)Add Files or Folders")
    String vcsAddFilesLabel();
    @DefaultStringValue("(D)Add")
    String vcsAddFilesButtonlabel();
    @DefaultStringValue("(D)Add")
    String vcsAddFilesMenulabel();
    @DefaultStringValue("(D)Add the selected files or folders")
    String vcsAddFilesDesc();
    
    // Command: vcsRemoveFiles
    @DefaultStringValue("(D)Remove Files or Folders")
    String vcsRemoveFilesLabel();
    @DefaultStringValue("(D)Delete")
    String vcsRemoveFilesButtonlabel();
    @DefaultStringValue("(D)Delete")
    String vcsRemoveFilesMenulabel();
    @DefaultStringValue("(D)Delete the selected files or folders")
    String vcsRemoveFilesDesc();
    
    // Command: vcsDiff
    @DefaultStringValue("(D)Diff Selected Files")
    String vcsDiffLabel();
    @DefaultStringValue("(D)Diff")
    String vcsDiffButtonlabel();
    @DefaultStringValue("(D)Diff")
    String vcsDiffMenulabel();
    @DefaultStringValue("(D)Diff selected file(s)")
    String vcsDiffDesc();
    
    // Command: vcsCommit
    @DefaultStringValue("(D)Commit Pending Changes")
    String vcsCommitLabel();
    @DefaultStringValue("(D)Commit")
    String vcsCommitButtonlabel();
    @DefaultStringValue("(D)_Commit...")
    String vcsCommitMenulabel();
    @DefaultStringValue("(D)Commit pending changes")
    String vcsCommitDesc();
    
    // Command: vcsRevert
    @DefaultStringValue("(D)Revert Changes")
    String vcsRevertLabel();
    @DefaultStringValue("(D)Revert")
    String vcsRevertButtonlabel();
    @DefaultStringValue("(D)Revert...")
    String vcsRevertMenulabel();
    @DefaultStringValue("(D)Revert selected changes")
    String vcsRevertDesc();
    
    // Command: vcsShowHistory
    @DefaultStringValue("(D)View History of Previous Commits")
    String vcsShowHistoryLabel();
    @DefaultStringValue("(D)History")
    String vcsShowHistoryButtonlabel();
    @DefaultStringValue("(D)_History")
    String vcsShowHistoryMenulabel();
    @DefaultStringValue("(D)View history of previous commits")
    String vcsShowHistoryDesc();
    
    // Command: vcsRefresh
    @DefaultStringValue("(D)Refresh File List from Source Control")
    String vcsRefreshLabel();
    @DefaultStringValue("(D)Refresh listing")
    String vcsRefreshDesc();
    
    // Command: vcsRefreshNoError
    
    // Command: vcsOpen
    @DefaultStringValue("(D)Open Selected Files(s)")
    String vcsOpenLabel();
    @DefaultStringValue("(D)Open File")
    String vcsOpenMenulabel();
    @DefaultStringValue("(D)Open selected file(s)")
    String vcsOpenDesc();
    
    // Command: vcsIgnore
    @DefaultStringValue("(D)Ignore Files or Folders")
    String vcsIgnoreLabel();
    @DefaultStringValue("(D)Ignore")
    String vcsIgnoreButtonlabel();
    @DefaultStringValue("(D)Ignore...")
    String vcsIgnoreMenulabel();
    @DefaultStringValue("(D)Ignore the selected files or folders")
    String vcsIgnoreDesc();
    
    // Command: vcsPull
    @DefaultStringValue("(D)Pull")
    String vcsPullButtonlabel();
    @DefaultStringValue("(D)_Pull Branches")
    String vcsPullMenulabel();
    
    // Command: vcsPullRebase
    @DefaultStringValue("(D)Pull with Rebase")
    String vcsPullRebaseButtonlabel();
    @DefaultStringValue("(D)_Pull with Rebase")
    String vcsPullRebaseMenulabel();
    
    // Command: vcsPush
    @DefaultStringValue("(D)Push")
    String vcsPushButtonlabel();
    @DefaultStringValue("(D)P_ush Branch")
    String vcsPushMenulabel();
    
    // Command: vcsCleanup
    @DefaultStringValue("(D)Cleanup")
    String vcsCleanupButtonlabel();
    @DefaultStringValue("(D)Cleanu_p")
    String vcsCleanupMenulabel();
    @DefaultStringValue("(D)Recursively clean up the working copy (removing locks, etc)")
    String vcsCleanupDesc();
    
    // Command: vcsResolve
    @DefaultStringValue("(D)Resolve")
    String vcsResolveButtonlabel();
    @DefaultStringValue("(D)Resolve...")
    String vcsResolveMenulabel();
    @DefaultStringValue("(D)Resolve conflicts in the selected files or folders")
    String vcsResolveDesc();
    
    // Command: consoleClear
    @DefaultStringValue("(D)Clear Console")
    String consoleClearLabel();
    @DefaultStringValue("(D)")
    String consoleClearButtonlabel();
    @DefaultStringValue("(D)Cle_ar Console")
    String consoleClearMenulabel();
    @DefaultStringValue("(D)Clear console")
    String consoleClearDesc();
    
    // Command: clearBuild
    @DefaultStringValue("(D)Clear Build Pane Output")
    String clearBuildLabel();
    @DefaultStringValue("(D)")
    String clearBuildButtonlabel();
    @DefaultStringValue("(D)Clear build")
    String clearBuildDesc();
    
    // Command: interruptR
    @DefaultStringValue("(D)Interrupt R Session")
    String interruptRLabel();
    @DefaultStringValue("(D)")
    String interruptRButtonlabel();
    @DefaultStringValue("(D)_Interrupt R")
    String interruptRMenulabel();
    @DefaultStringValue("(D)Interrupt R")
    String interruptRDesc();
    
    // Command: restartR
    @DefaultStringValue("(D)Restart R Session")
    String restartRLabel();
    @DefaultStringValue("(D)_Restart R")
    String restartRMenulabel();
    @DefaultStringValue("(D)Restart R")
    String restartRDesc();
    
    // Command: restartRClearOutput
    @DefaultStringValue("(D)Restart R Session and Clear Chunk Output")
    String restartRClearOutputLabel();
    @DefaultStringValue("(D)Restart R and Clear _Output")
    String restartRClearOutputMenulabel();
    @DefaultStringValue("(D)Restart R session and clear chunk output")
    String restartRClearOutputDesc();
    
    // Command: restartRRunAllChunks
    @DefaultStringValue("(D)Restart R Session and Run All Chunks")
    String restartRRunAllChunksLabel();
    @DefaultStringValue("(D)Restart R and Run _All Chunks")
    String restartRRunAllChunksMenulabel();
    @DefaultStringValue("(D)Restart R session and run all chunks")
    String restartRRunAllChunksDesc();
    
    // Command: terminateR
    @DefaultStringValue("(D)Terminate R Session")
    String terminateRLabel();
    @DefaultStringValue("(D)_Terminate R...")
    String terminateRMenulabel();
    @DefaultStringValue("(D)Forcibly terminate R session")
    String terminateRDesc();
    
    // Command: showPdfExternal
    @DefaultStringValue("(D)Show PDF in External Viewer")
    String showPdfExternalLabel();
    @DefaultStringValue("(D)Show PDF in External Viewer")
    String showPdfExternalMenulabel();
    @DefaultStringValue("(D)Show in an external PDF viewer window")
    String showPdfExternalDesc();
    
    // Command: openHtmlExternal
    @DefaultStringValue("(D)Open Page with Web Browser")
    String openHtmlExternalLabel();
    @DefaultStringValue("(D)")
    String openHtmlExternalButtonlabel();
    @DefaultStringValue("(D)View the page with the system web browser")
    String openHtmlExternalDesc();
    
    // Command: saveHtmlPreviewAsLocalFile
    @DefaultStringValue("(D)File on Local Computer...")
    String saveHtmlPreviewAsLocalFileMenulabel();
    @DefaultStringValue("(D)Download the page to a local file")
    String saveHtmlPreviewAsLocalFileDesc();
    
    // Command: saveHtmlPreviewAs
    @DefaultStringValue("(D)Save As")
    String saveHtmlPreviewAsButtonlabel();
    @DefaultStringValue("(D)File on RStudio Server...")
    String saveHtmlPreviewAsMenulabel();
    @DefaultStringValue("(D)Save the page to another location")
    String saveHtmlPreviewAsDesc();
    
    // Command: showHtmlPreviewLog
    @DefaultStringValue("(D)Log")
    String showHtmlPreviewLogButtonlabel();
    @DefaultStringValue("(D)Show the compilation log for this document")
    String showHtmlPreviewLogDesc();
    
    // Command: refreshHtmlPreview
    @DefaultStringValue("(D)Refresh the preview")
    String refreshHtmlPreviewDesc();
    
    // Command: refreshPresentation
    @DefaultStringValue("(D)Refresh the presentation")
    String refreshPresentationDesc();
    
    // Command: presentationFullscreen
    @DefaultStringValue("(D)Show presentation in full screen mode")
    String presentationFullscreenDesc();
    
    // Command: presentationHome
    @DefaultStringValue("(D)Go to the first slide")
    String presentationHomeDesc();
    
    // Command: presentationNext
    @DefaultStringValue("(D)Go to the next slide")
    String presentationNextDesc();
    
    // Command: presentationPrev
    @DefaultStringValue("(D)Go to the previous slide")
    String presentationPrevDesc();
    
    // Command: presentationEdit
    @DefaultStringValue("(D)Edit this slide of the presentation")
    String presentationEditDesc();
    
    // Command: presentationViewInBrowser
    @DefaultStringValue("(D)_View in Browser")
    String presentationViewInBrowserMenulabel();
    @DefaultStringValue("(D)View the presentation in an external web browser")
    String presentationViewInBrowserDesc();
    
    // Command: presentationSaveAsStandalone
    @DefaultStringValue("(D)_Save As Web Page...")
    String presentationSaveAsStandaloneMenulabel();
    @DefaultStringValue("(D)Save the presentation as a standalone web page")
    String presentationSaveAsStandaloneDesc();
    
    // Command: clearPresentationCache
    @DefaultStringValue("(D)Clear Knitr Cache...")
    String clearPresentationCacheMenulabel();
    @DefaultStringValue("(D)Clear knitr cache for this presentation")
    String clearPresentationCacheDesc();
    
    // Command: historySendToSource
    @DefaultStringValue("(D)Insert Command into Document")
    String historySendToSourceLabel();
    @DefaultStringValue("(D)To Source")
    String historySendToSourceButtonlabel();
    @DefaultStringValue("(D)Insert into _Source")
    String historySendToSourceMenulabel();
    @DefaultStringValue("(D)Insert the selected commands into the current document (Shift+Enter)")
    String historySendToSourceDesc();
    
    // Command: historySendToConsole
    @DefaultStringValue("(D)Send Command to Console")
    String historySendToConsoleLabel();
    @DefaultStringValue("(D)To Console")
    String historySendToConsoleButtonlabel();
    @DefaultStringValue("(D)Send to _Console")
    String historySendToConsoleMenulabel();
    @DefaultStringValue("(D)Send the selected commands to the R console (Enter)")
    String historySendToConsoleDesc();
    
    // Command: loadHistory
    @DefaultStringValue("(D)")
    String loadHistoryButtonlabel();
    @DefaultStringValue("(D)_Load History...")
    String loadHistoryMenulabel();
    @DefaultStringValue("(D)Load history from an existing file")
    String loadHistoryDesc();
    
    // Command: saveHistory
    @DefaultStringValue("(D)")
    String saveHistoryButtonlabel();
    @DefaultStringValue("(D)Sa_ve History As...")
    String saveHistoryMenulabel();
    @DefaultStringValue("(D)Save history into a file")
    String saveHistoryDesc();
    
    // Command: historyRemoveEntries
    @DefaultStringValue("(D)")
    String historyRemoveEntriesButtonlabel();
    @DefaultStringValue("(D)_Remove Entries...")
    String historyRemoveEntriesMenulabel();
    @DefaultStringValue("(D)Remove the selected history entries")
    String historyRemoveEntriesDesc();
    
    // Command: clearHistory
    @DefaultStringValue("(D)")
    String clearHistoryButtonlabel();
    @DefaultStringValue("(D)Clear _All...")
    String clearHistoryMenulabel();
    @DefaultStringValue("(D)Clear all history entries")
    String clearHistoryDesc();
    
    // Command: historyDismissResults
    @DefaultStringValue("(D)Dismiss History Results")
    String historyDismissResultsLabel();
    @DefaultStringValue("(D)Done")
    String historyDismissResultsButtonlabel();
    
    // Command: historyShowContext
    @DefaultStringValue("(D)Show In Context")
    String historyShowContextLabel();
    
    // Command: historyDismissContext
    @DefaultStringValue("(D)Dismiss History Context")
    String historyDismissContextLabel();
    @DefaultStringValue("(D)« Back")
    String historyDismissContextButtonlabel();
    
    // Command: nextPlot
    @DefaultStringValue("(D)Show Next Plot")
    String nextPlotLabel();
    @DefaultStringValue("(D)")
    String nextPlotButtonlabel();
    @DefaultStringValue("(D)_Next Plot")
    String nextPlotMenulabel();
    @DefaultStringValue("(D)Next plot")
    String nextPlotDesc();
    
    // Command: previousPlot
    @DefaultStringValue("(D)Show Previous Plot")
    String previousPlotLabel();
    @DefaultStringValue("(D)")
    String previousPlotButtonlabel();
    @DefaultStringValue("(D)_Previous Plot")
    String previousPlotMenulabel();
    @DefaultStringValue("(D)Previous plot")
    String previousPlotDesc();
    
    // Command: savePlotAsImage
    @DefaultStringValue("(D)Save Plot As Image...")
    String savePlotAsImageLabel();
    @DefaultStringValue("(D)Save as _Image...")
    String savePlotAsImageMenulabel();
    @DefaultStringValue("(D)Save the current plot as an image file")
    String savePlotAsImageDesc();
    
    // Command: savePlotAsPdf
    @DefaultStringValue("(D)Save Plot as PDF...")
    String savePlotAsPdfLabel();
    @DefaultStringValue("(D)Save as P_DF...")
    String savePlotAsPdfMenulabel();
    @DefaultStringValue("(D)Save the current plot as a PDF file")
    String savePlotAsPdfDesc();
    
    // Command: copyPlotToClipboard
    @DefaultStringValue("(D)Copy Current Plot to Clipboard...")
    String copyPlotToClipboardLabel();
    @DefaultStringValue("(D)Cop_y to Clipboard...")
    String copyPlotToClipboardMenulabel();
    @DefaultStringValue("(D)Copy the current plot to the clipboard")
    String copyPlotToClipboardDesc();
    
    // Command: zoomPlot
    @DefaultStringValue("(D)Zoom")
    String zoomPlotButtonlabel();
    @DefaultStringValue("(D)_Zoom Plot...")
    String zoomPlotMenulabel();
    @DefaultStringValue("(D)View a larger version of the plot in a new window")
    String zoomPlotDesc();
    
    // Command: removePlot
    @DefaultStringValue("(D)Remove Current Plot...")
    String removePlotLabel();
    @DefaultStringValue("(D)")
    String removePlotButtonlabel();
    @DefaultStringValue("(D)_Remove Plot...")
    String removePlotMenulabel();
    @DefaultStringValue("(D)Remove the current plot")
    String removePlotDesc();
    
    // Command: clearPlots
    @DefaultStringValue("(D)Clear All Plots...")
    String clearPlotsLabel();
    @DefaultStringValue("(D)")
    String clearPlotsButtonlabel();
    @DefaultStringValue("(D)_Clear All...")
    String clearPlotsMenulabel();
    @DefaultStringValue("(D)Clear all Plots")
    String clearPlotsDesc();
    
    // Command: refreshPlot
    @DefaultStringValue("(D)Refresh Current Plot")
    String refreshPlotLabel();
    @DefaultStringValue("(D)")
    String refreshPlotButtonlabel();
    @DefaultStringValue("(D)Refresh")
    String refreshPlotMenulabel();
    @DefaultStringValue("(D)Refresh current plot")
    String refreshPlotDesc();
    
    // Command: showManipulator
    @DefaultStringValue("(D)Show Manipulator for Current Plot")
    String showManipulatorLabel();
    @DefaultStringValue("(D)")
    String showManipulatorButtonlabel();
    @DefaultStringValue("(D)Show _Manipulator")
    String showManipulatorMenulabel();
    @DefaultStringValue("(D)Show the manipulator for this plot")
    String showManipulatorDesc();
    
    // Command: clearWorkspace
    @DefaultStringValue("(D)_Clear Workspace...")
    String clearWorkspaceMenulabel();
    @DefaultStringValue("(D)Clear objects from the workspace")
    String clearWorkspaceDesc();
    
    // Command: loadWorkspace
    @DefaultStringValue("(D)_Load Workspace...")
    String loadWorkspaceMenulabel();
    @DefaultStringValue("(D)Load workspace")
    String loadWorkspaceDesc();
    
    // Command: saveWorkspace
    @DefaultStringValue("(D)_Save Workspace As...")
    String saveWorkspaceMenulabel();
    @DefaultStringValue("(D)Save workspace as")
    String saveWorkspaceDesc();
    
    // Command: importDatasetFromFile
    @DefaultStringValue("(D)Import Dataset from File...")
    String importDatasetFromFileLabel();
    @DefaultStringValue("(D)From _Local File...")
    String importDatasetFromFileMenulabel();
    
    // Command: importDatasetFromURL
    @DefaultStringValue("(D)Import Dataset from URL...")
    String importDatasetFromURLLabel();
    @DefaultStringValue("(D)From _Web URL...")
    String importDatasetFromURLMenulabel();
    
    // Command: importDatasetFromCsv
    @DefaultStringValue("(D)From CSV")
    String importDatasetFromCsvLabel();
    @DefaultStringValue("(D)From _CSV")
    String importDatasetFromCsvMenulabel();
    
    // Command: importDatasetFromCsvUsingReadr
    @DefaultStringValue("(D)From Text (readr)...")
    String importDatasetFromCsvUsingReadrLabel();
    @DefaultStringValue("(D)From Text (_readr)...")
    String importDatasetFromCsvUsingReadrMenulabel();
    
    // Command: importDatasetFromCsvUsingBase
    @DefaultStringValue("(D)From Text (base)...")
    String importDatasetFromCsvUsingBaseLabel();
    @DefaultStringValue("(D)From Text (_base)...")
    String importDatasetFromCsvUsingBaseMenulabel();
    
    // Command: importDatasetFromSAV
    @DefaultStringValue("(D)Import Dataset from SPSS...")
    String importDatasetFromSAVLabel();
    @DefaultStringValue("(D)From _SPSS...")
    String importDatasetFromSAVMenulabel();
    
    // Command: importDatasetFromSAS
    @DefaultStringValue("(D)Import Dataset from SAS...")
    String importDatasetFromSASLabel();
    @DefaultStringValue("(D)From S_AS...")
    String importDatasetFromSASMenulabel();
    
    // Command: importDatasetFromStata
    @DefaultStringValue("(D)Import Dataset from Stata...")
    String importDatasetFromStataLabel();
    @DefaultStringValue("(D)From S_tata...")
    String importDatasetFromStataMenulabel();
    
    // Command: importDatasetFromXLS
    @DefaultStringValue("(D)Import Dataset from Excel...")
    String importDatasetFromXLSLabel();
    @DefaultStringValue("(D)From _Excel...")
    String importDatasetFromXLSMenulabel();
    
    // Command: refreshWorkspace
    @DefaultStringValue("(D)")
    String refreshWorkspaceButtonlabel();
    @DefaultStringValue("(D)Refresh")
    String refreshWorkspaceMenulabel();
    @DefaultStringValue("(D)Refresh Workspace")
    String refreshWorkspaceDesc();
    
    // Command: installPackage
    @DefaultStringValue("(D)Install Packages...")
    String installPackageLabel();
    @DefaultStringValue("(D)Install")
    String installPackageButtonlabel();
    @DefaultStringValue("(D)Install Pac_kages...")
    String installPackageMenulabel();
    @DefaultStringValue("(D)Install R packages")
    String installPackageDesc();
    
    // Command: updatePackages
    @DefaultStringValue("(D)Update Packages...")
    String updatePackagesLabel();
    @DefaultStringValue("(D)Update")
    String updatePackagesButtonlabel();
    @DefaultStringValue("(D)Check for Package _Updates...")
    String updatePackagesMenulabel();
    @DefaultStringValue("(D)Check for package updates")
    String updatePackagesDesc();
    
    // Command: refreshPackages
    @DefaultStringValue("(D)Refresh Packages Pane")
    String refreshPackagesLabel();
    @DefaultStringValue("(D)")
    String refreshPackagesButtonlabel();
    @DefaultStringValue("(D)Refresh Package listing")
    String refreshPackagesDesc();
    
    // Command: packratBootstrap
    @DefaultStringValue("(D)Packrat")
    String packratBootstrapButtonlabel();
    @DefaultStringValue("(D)_Initialize Packrat...")
    String packratBootstrapMenulabel();
    @DefaultStringValue("(D)Use packrat with this project")
    String packratBootstrapDesc();
    
    // Command: packratClean
    @DefaultStringValue("(D)_Clean Unused Packages...")
    String packratCleanMenulabel();
    @DefaultStringValue("(D)Remove unused packages from your packrat library")
    String packratCleanDesc();
    
    // Command: packratHelp
    @DefaultStringValue("(D)Using Packrat")
    String packratHelpMenulabel();
    @DefaultStringValue("(D)Help on using packrat with R projects")
    String packratHelpDesc();
    
    // Command: packratOptions
    @DefaultStringValue("(D)Options")
    String packratOptionsButtonlabel();
    @DefaultStringValue("(D)Packrat _Options...")
    String packratOptionsMenulabel();
    @DefaultStringValue("(D)Configure packrat options for this project")
    String packratOptionsDesc();
    
    // Command: packratBundle
    @DefaultStringValue("(D)Bundle")
    String packratBundleButtonlabel();
    @DefaultStringValue("(D)Export Project _Bundle...")
    String packratBundleMenulabel();
    @DefaultStringValue("(D)Bundle a Packrat Project")
    String packratBundleDesc();
    
    // Command: packratCheckStatus
    @DefaultStringValue("(D)Check Library _Status...")
    String packratCheckStatusMenulabel();
    @DefaultStringValue("(D)Check the status of the Packrat library")
    String packratCheckStatusDesc();
    
    // Command: renvHelp
    @DefaultStringValue("(D)Introduction to renv")
    String renvHelpMenulabel();
    @DefaultStringValue("(D)Learn how to use renv")
    String renvHelpDesc();
    
    // Command: renvSnapshot
    @DefaultStringValue("(D)Snapshot Library...")
    String renvSnapshotMenulabel();
    @DefaultStringValue("(D)Snapshot the state of your project library")
    String renvSnapshotDesc();
    
    // Command: renvRestore
    @DefaultStringValue("(D)Restore Library...")
    String renvRestoreMenulabel();
    @DefaultStringValue("(D)Restore your project library from renv.lock")
    String renvRestoreDesc();
    
    // Command: versionControlOptions
    @DefaultStringValue("(D)_Options...")
    String versionControlOptionsMenulabel();
    @DefaultStringValue("(D)Configure version control options")
    String versionControlOptionsDesc();
    
    // Command: versionControlHelp
    @DefaultStringValue("(D)_Using Version Control")
    String versionControlHelpMenulabel();
    @DefaultStringValue("(D)Help on using version control with RStudio")
    String versionControlHelpDesc();
    
    // Command: versionControlShowRsaKey
    @DefaultStringValue("(D)Show Public Key...")
    String versionControlShowRsaKeyLabel();
    @DefaultStringValue("(D)Show Public Key...")
    String versionControlShowRsaKeyMenulabel();
    @DefaultStringValue("(D)Show RSA public key")
    String versionControlShowRsaKeyDesc();
    
    // Command: versionControlProjectSetup
    @DefaultStringValue("(D)Project _Setup...")
    String versionControlProjectSetupMenulabel();
    @DefaultStringValue("(D)Setup version control for the current project")
    String versionControlProjectSetupDesc();
    
    // Command: showShellDialog
    @DefaultStringValue("(D)Open Shell")
    String showShellDialogLabel();
    @DefaultStringValue("(D)_Shell...")
    String showShellDialogMenulabel();
    @DefaultStringValue("(D)Execute shell commands")
    String showShellDialogDesc();
    
    // Command: newTerminal
    @DefaultStringValue("(D)New Terminal")
    String newTerminalLabel();
    @DefaultStringValue("(D)_New Terminal")
    String newTerminalMenulabel();
    @DefaultStringValue("(D)Create a new terminal")
    String newTerminalDesc();
    
    // Command: activateTerminal
    @DefaultStringValue("(D)Move Focus to Terminal")
    String activateTerminalLabel();
    @DefaultStringValue("(D)_Move Focus to Terminal")
    String activateTerminalMenulabel();
    
    // Command: renameTerminal
    @DefaultStringValue("(D)Rename Terminal")
    String renameTerminalLabel();
    @DefaultStringValue("(D)_Rename Terminal")
    String renameTerminalMenulabel();
    @DefaultStringValue("(D)Change terminal session name")
    String renameTerminalDesc();
    
    // Command: closeTerminal
    @DefaultStringValue("(D)Close Terminal")
    String closeTerminalLabel();
    @DefaultStringValue("(D)")
    String closeTerminalButtonlabel();
    @DefaultStringValue("(D)Cl_ose Terminal")
    String closeTerminalMenulabel();
    @DefaultStringValue("(D)Close current terminal session")
    String closeTerminalDesc();
    
    // Command: closeAllTerminals
    @DefaultStringValue("(D)Close All Terminals")
    String closeAllTerminalsLabel();
    @DefaultStringValue("(D)")
    String closeAllTerminalsButtonlabel();
    @DefaultStringValue("(D)Close _All Terminals")
    String closeAllTerminalsMenulabel();
    
    // Command: clearTerminalScrollbackBuffer
    @DefaultStringValue("(D)Clear Terminal Buffer")
    String clearTerminalScrollbackBufferLabel();
    @DefaultStringValue("(D)")
    String clearTerminalScrollbackBufferButtonlabel();
    @DefaultStringValue("(D)_Clear Terminal Buffer")
    String clearTerminalScrollbackBufferMenulabel();
    @DefaultStringValue("(D)Clear terminal")
    String clearTerminalScrollbackBufferDesc();
    
    // Command: previousTerminal
    @DefaultStringValue("(D)Previous Terminal")
    String previousTerminalLabel();
    @DefaultStringValue("(D)")
    String previousTerminalButtonlabel();
    @DefaultStringValue("(D)_Previous Terminal")
    String previousTerminalMenulabel();
    @DefaultStringValue("(D)Show previous terminal")
    String previousTerminalDesc();
    
    // Command: nextTerminal
    @DefaultStringValue("(D)Next Terminal")
    String nextTerminalLabel();
    @DefaultStringValue("(D)")
    String nextTerminalButtonlabel();
    @DefaultStringValue("(D)Ne_xt Terminal")
    String nextTerminalMenulabel();
    @DefaultStringValue("(D)Show next terminal")
    String nextTerminalDesc();
    
    // Command: showTerminalInfo
    @DefaultStringValue("(D)Terminal Diagnostics...")
    String showTerminalInfoLabel();
    @DefaultStringValue("(D)")
    String showTerminalInfoButtonlabel();
    @DefaultStringValue("(D)Terminal _Diagnostics...")
    String showTerminalInfoMenulabel();
    @DefaultStringValue("(D)Show info on current terminal")
    String showTerminalInfoDesc();
    
    // Command: interruptTerminal
    @DefaultStringValue("(D)Send Interrupt")
    String interruptTerminalLabel();
    @DefaultStringValue("(D)")
    String interruptTerminalButtonlabel();
    @DefaultStringValue("(D)_Interrupt Current Terminal")
    String interruptTerminalMenulabel();
    @DefaultStringValue("(D)Send Ctrl+C to Current Terminal")
    String interruptTerminalDesc();
    
    // Command: sendTerminalToEditor
    @DefaultStringValue("(D)Copy Terminal to Editor")
    String sendTerminalToEditorLabel();
    @DefaultStringValue("(D)")
    String sendTerminalToEditorButtonlabel();
    @DefaultStringValue("(D)Copy Terminal to _Editor")
    String sendTerminalToEditorMenulabel();
    @DefaultStringValue("(D)Copy current terminal's buffer to a new editor buffer")
    String sendTerminalToEditorDesc();
    
    // Command: sendToTerminal
    @DefaultStringValue("(D)Send Selection to Terminal")
    String sendToTerminalLabel();
    @DefaultStringValue("(D)")
    String sendToTerminalButtonlabel();
    @DefaultStringValue("(D)Send to _Terminal")
    String sendToTerminalMenulabel();
    @DefaultStringValue("(D)Send the current line or selection to terminal")
    String sendToTerminalDesc();
    
    // Command: sendFilenameToTerminal
    @DefaultStringValue("(D)Send _Filename to Terminal")
    String sendFilenameToTerminalMenulabel();
    
    // Command: openNewTerminalAtEditorLocation
    @DefaultStringValue("(D)_Open New Terminal at File Location")
    String openNewTerminalAtEditorLocationMenulabel();
    
    // Command: openNewTerminalAtFilePaneLocation
    @DefaultStringValue("(D)Open New Terminal Here")
    String openNewTerminalAtFilePaneLocationMenulabel();
    
    // Command: setTerminalToCurrentDirectory
    @DefaultStringValue("(D)_Go to Current Directory")
    String setTerminalToCurrentDirectoryMenulabel();
    
    // Command: browseAddins
    @DefaultStringValue("(D)Browse Addins")
    String browseAddinsLabel();
    @DefaultStringValue("(D)_Browse Addins...")
    String browseAddinsMenulabel();
    @DefaultStringValue("(D)Browse addins")
    String browseAddinsDesc();
    
    // Command: macPreferences
    @DefaultStringValue("(D)_Preferences...")
    String macPreferencesMenulabel();
    
    // Command: showOptions
    @DefaultStringValue("(D)_Global Options...")
    String showOptionsMenulabel();
    
    // Command: showCodeOptions
    @DefaultStringValue("(D)Code Options...")
    String showCodeOptionsLabel();
    
    // Command: showConsoleOptions
    @DefaultStringValue("(D)Console Options...")
    String showConsoleOptionsLabel();
    
    // Command: showAppearanceOptions
    @DefaultStringValue("(D)Appearance Options...")
    String showAppearanceOptionsLabel();
    
    // Command: paneLayout
    @DefaultStringValue("(D)Pane Layout Options...")
    String paneLayoutLabel();
    @DefaultStringValue("(D)Pane Layo_ut...")
    String paneLayoutMenulabel();
    
    // Command: showPackagesOptions
    @DefaultStringValue("(D)Packages Options...")
    String showPackagesOptionsLabel();
    
    // Command: showRMarkdownOptions
    @DefaultStringValue("(D)R Markdown Options...")
    String showRMarkdownOptionsLabel();
    
    // Command: showSweaveOptions
    @DefaultStringValue("(D)Sweave Options...")
    String showSweaveOptionsLabel();
    
    // Command: showSpellingOptions
    @DefaultStringValue("(D)Spelling Options...")
    String showSpellingOptionsLabel();
    
    // Command: showVcsOptions
    @DefaultStringValue("(D)Git/SVN Version Control Options...")
    String showVcsOptionsLabel();
    
    // Command: showPublishingOptions
    @DefaultStringValue("(D)Publishing Options...")
    String showPublishingOptionsLabel();
    
    // Command: showTerminalOptions
    @DefaultStringValue("(D)_Terminal Options...")
    String showTerminalOptionsMenulabel();
    
    // Command: showAccessibilityOptions
    @DefaultStringValue("(D)Accessibility _Options...")
    String showAccessibilityOptionsMenulabel();
    
    // Command: showPythonOptions
    @DefaultStringValue("(D)Python Options...")
    String showPythonOptionsLabel();
    
    // Command: modifyKeyboardShortcuts
    @DefaultStringValue("(D)_Modify Keyboard Shortcuts...")
    String modifyKeyboardShortcutsMenulabel();
    @DefaultStringValue("(D)Modify keyboard shortcuts")
    String modifyKeyboardShortcutsDesc();
    
    // Command: checkForUpdates
    @DefaultStringValue("(D)Check for RStudio Updates")
    String checkForUpdatesLabel();
    @DefaultStringValue("(D)Check for _Updates")
    String checkForUpdatesMenulabel();
    
    // Command: helpUsingRStudio
    @DefaultStringValue("(D)RStudio _Docs")
    String helpUsingRStudioMenulabel();
    
    // Command: helpKeyboardShortcuts
    @DefaultStringValue("(D)_Keyboard Shortcuts Help")
    String helpKeyboardShortcutsMenulabel();
    
    // Command: helpBack
    @DefaultStringValue("(D)Previous Help Topic")
    String helpBackLabel();
    @DefaultStringValue("(D)")
    String helpBackButtonlabel();
    @DefaultStringValue("(D)Previous topic")
    String helpBackDesc();
    
    // Command: helpForward
    @DefaultStringValue("(D)Next Help Topic")
    String helpForwardLabel();
    @DefaultStringValue("(D)")
    String helpForwardButtonlabel();
    @DefaultStringValue("(D)Next topic")
    String helpForwardDesc();
    
    // Command: helpHome
    @DefaultStringValue("(D)Show R Help")
    String helpHomeLabel();
    @DefaultStringValue("(D)")
    String helpHomeButtonlabel();
    @DefaultStringValue("(D)R _Help")
    String helpHomeMenulabel();
    @DefaultStringValue("(D)Show R Help")
    String helpHomeDesc();
    
    // Command: helpSearch
    @DefaultStringValue("(D)Search R Hel_p")
    String helpSearchMenulabel();
    
    // Command: printHelp
    @DefaultStringValue("(D)Print Help Topic")
    String printHelpLabel();
    @DefaultStringValue("(D)")
    String printHelpButtonlabel();
    @DefaultStringValue("(D)Print topic")
    String printHelpDesc();
    
    // Command: clearHelpHistory
    @DefaultStringValue("(D)Clear Help History")
    String clearHelpHistoryLabel();
    @DefaultStringValue("(D)Clear history")
    String clearHelpHistoryMenulabel();
    @DefaultStringValue("(D)Clear history")
    String clearHelpHistoryDesc();
    
    // Command: helpPopout
    @DefaultStringValue("(D)Show Help in New Window")
    String helpPopoutLabel();
    @DefaultStringValue("(D)")
    String helpPopoutButtonlabel();
    @DefaultStringValue("(D)Show in new window")
    String helpPopoutDesc();
    
    // Command: refreshHelp
    @DefaultStringValue("(D)Refresh Help Topic")
    String refreshHelpLabel();
    @DefaultStringValue("(D)Refresh")
    String refreshHelpMenulabel();
    @DefaultStringValue("(D)Refresh topic")
    String refreshHelpDesc();
    
    // Command: tutorialPopout
    @DefaultStringValue("(D)")
    String tutorialPopoutButtonlabel();
    @DefaultStringValue("(D)Show in new window")
    String tutorialPopoutDesc();
    
    // Command: tutorialBack
    @DefaultStringValue("(D)")
    String tutorialBackButtonlabel();
    @DefaultStringValue("(D)Go back")
    String tutorialBackDesc();
    
    // Command: tutorialForward
    @DefaultStringValue("(D)")
    String tutorialForwardButtonlabel();
    @DefaultStringValue("(D)Go forward")
    String tutorialForwardDesc();
    
    // Command: tutorialZoom
    @DefaultStringValue("(D)Zoom")
    String tutorialZoomButtonlabel();
    @DefaultStringValue("(D)View a larger version in a new window")
    String tutorialZoomDesc();
    
    // Command: tutorialRefresh
    @DefaultStringValue("(D)Refresh tutorial")
    String tutorialRefreshDesc();
    
    // Command: tutorialStop
    @DefaultStringValue("(D)")
    String tutorialStopButtonlabel();
    @DefaultStringValue("(D)Stop tutorial")
    String tutorialStopDesc();
    
    // Command: tutorialHome
    @DefaultStringValue("(D)")
    String tutorialHomeButtonlabel();
    @DefaultStringValue("(D)Return to home")
    String tutorialHomeDesc();
    
    // Command: viewerPopout
    @DefaultStringValue("(D)")
    String viewerPopoutButtonlabel();
    @DefaultStringValue("(D)Show in new window")
    String viewerPopoutDesc();
    
    // Command: viewerBack
    @DefaultStringValue("(D)")
    String viewerBackButtonlabel();
    @DefaultStringValue("(D)Go back")
    String viewerBackDesc();
    
    // Command: viewerForward
    @DefaultStringValue("(D)")
    String viewerForwardButtonlabel();
    @DefaultStringValue("(D)Go forward")
    String viewerForwardDesc();
    
    // Command: viewerZoom
    @DefaultStringValue("(D)Zoom")
    String viewerZoomButtonlabel();
    @DefaultStringValue("(D)View a larger version in a new window")
    String viewerZoomDesc();
    
    // Command: viewerRefresh
    @DefaultStringValue("(D)Refresh viewer")
    String viewerRefreshDesc();
    
    // Command: viewerSaveAllAndRefresh
    @DefaultStringValue("(D)Save source files and refresh viewer")
    String viewerSaveAllAndRefreshDesc();
    
    // Command: viewerStop
    @DefaultStringValue("(D)")
    String viewerStopButtonlabel();
    @DefaultStringValue("(D)Stop application")
    String viewerStopDesc();
    
    // Command: viewerClear
    @DefaultStringValue("(D)")
    String viewerClearButtonlabel();
    @DefaultStringValue("(D)Remove current viewer item")
    String viewerClearDesc();
    
    // Command: viewerClearAll
    @DefaultStringValue("(D)")
    String viewerClearAllButtonlabel();
    @DefaultStringValue("(D)Clear all viewer items")
    String viewerClearAllDesc();
    
    // Command: viewerSaveAsImage
    @DefaultStringValue("(D)Save as Image...")
    String viewerSaveAsImageMenulabel();
    @DefaultStringValue("(D)Save as an image file")
    String viewerSaveAsImageDesc();
    
    // Command: viewerSaveAsWebPage
    @DefaultStringValue("(D)Save as Web Page...")
    String viewerSaveAsWebPageMenulabel();
    @DefaultStringValue("(D)Save as a standalone web page")
    String viewerSaveAsWebPageDesc();
    
    // Command: viewerCopyToClipboard
    @DefaultStringValue("(D)Copy to Clipboard...")
    String viewerCopyToClipboardMenulabel();
    @DefaultStringValue("(D)Copy to the system clipboard")
    String viewerCopyToClipboardDesc();
    
    // Command: raiseException
    @DefaultStringValue("(D)Raise E_xception")
    String raiseExceptionMenulabel();
    
    // Command: raiseException2
    @DefaultStringValue("(D)Raise Exception _JS")
    String raiseException2Menulabel();
    
    // Command: showWarningBar
    @DefaultStringValue("(D)Show warning bar")
    String showWarningBarMenulabel();
    
    // Command: showRequestLog
    @DefaultStringValue("(D)_Request Log")
    String showRequestLogMenulabel();
    @DefaultStringValue("(D)Show internal request log")
    String showRequestLogDesc();
    
    // Command: diagnosticsReport
    @DefaultStringValue("(D)_Write Diagnostics Report")
    String diagnosticsReportMenulabel();
    
    // Command: openDeveloperConsole
    @DefaultStringValue("(D)_Open Developer Console")
    String openDeveloperConsoleMenulabel();
    
    // Command: reloadUi
    @DefaultStringValue("(D)Reload _UI")
    String reloadUiMenulabel();
    
    // Command: logFocusedElement
    @DefaultStringValue("(D)Log focused element")
    String logFocusedElementMenulabel();
    
    // Command: debugDumpContents
    @DefaultStringValue("(D)_Dump Editor Contents...")
    String debugDumpContentsMenulabel();
    
    // Command: debugImportDump
    @DefaultStringValue("(D)_Import Editor Contents...")
    String debugImportDumpMenulabel();
    
    // Command: refreshSuperDevMode
    
    // Command: newSession
    @DefaultStringValue("(D)Open a New R Session")
    String newSessionLabel();
    @DefaultStringValue("(D)")
    String newSessionButtonlabel();
    @DefaultStringValue("(D)_New Session")
    String newSessionMenulabel();
    @DefaultStringValue("(D)Open a new R session")
    String newSessionDesc();
    
    // Command: suspendSession
    @DefaultStringValue("(D)Suspend R Session")
    String suspendSessionLabel();
    @DefaultStringValue("(D)_Suspend R Session")
    String suspendSessionMenulabel();
    
    // Command: quitSession
    @DefaultStringValue("(D)Quit the Current R Session")
    String quitSessionLabel();
    @DefaultStringValue("(D)")
    String quitSessionButtonlabel();
    @DefaultStringValue("(D)_Quit Session...")
    String quitSessionMenulabel();
    @DefaultStringValue("(D)Quit the current R session")
    String quitSessionDesc();
    
    // Command: forceQuitSession
    @DefaultStringValue("(D)Quit the Current R Session Even if Busy")
    String forceQuitSessionLabel();
    @DefaultStringValue("(D)")
    String forceQuitSessionButtonlabel();
    @DefaultStringValue("(D)Force Quit Session...")
    String forceQuitSessionMenulabel();
    @DefaultStringValue("(D)Quit the current R session even if busy")
    String forceQuitSessionDesc();
    
    // Command: showSessionServerOptionsDialog
    @DefaultStringValue("(D)Session Server Settings...")
    String showSessionServerOptionsDialogLabel();
    @DefaultStringValue("(D)")
    String showSessionServerOptionsDialogButtonlabel();
    @DefaultStringValue("(D)_Session Server Settings...")
    String showSessionServerOptionsDialogMenulabel();
    @DefaultStringValue("(D)Configure available session servers")
    String showSessionServerOptionsDialogDesc();
    
    // Command: showAboutDialog
    @DefaultStringValue("(D)About RStudio...")
    String showAboutDialogLabel();
    @DefaultStringValue("(D)A_bout RStudio")
    String showAboutDialogMenulabel();
    
    // Command: showLicenseDialog
    @DefaultStringValue("(D)Manage License...")
    String showLicenseDialogLabel();
    @DefaultStringValue("(D)Ma_nage License...")
    String showLicenseDialogMenulabel();
    
    // Command: showLogFiles
    @DefaultStringValue("(D)_Show Log Files")
    String showLogFilesMenulabel();
    
    // Command: updateCredentials
    @DefaultStringValue("(D)_Update Credentials")
    String updateCredentialsMenulabel();
    
    // Command: rstudioCommunityForum
    @DefaultStringValue("(D)RStudio Community _Forum")
    String rstudioCommunityForumMenulabel();
    
    // Command: rstudioSupport
    @DefaultStringValue("(D)RStudio _Support")
    String rstudioSupportMenulabel();
    
    // Command: rstudioLicense
    @DefaultStringValue("(D)RStudio _License")
    String rstudioLicenseMenulabel();
    
    // Command: buildAll
    @DefaultStringValue("(D)Install and Restart")
    String buildAllLabel();
    @DefaultStringValue("(D)Install and Restart")
    String buildAllButtonlabel();
    @DefaultStringValue("(D)_Install and Restart")
    String buildAllMenulabel();
    @DefaultStringValue("(D)Install the package and restart R")
    String buildAllDesc();
    
    // Command: rebuildAll
    @DefaultStringValue("(D)Clean and Rebuild")
    String rebuildAllLabel();
    @DefaultStringValue("(D)Clean and _Rebuild")
    String rebuildAllMenulabel();
    @DefaultStringValue("(D)Clean previous output and rebuild all")
    String rebuildAllDesc();
    
    // Command: cleanAll
    @DefaultStringValue("(D)Clean All")
    String cleanAllLabel();
    @DefaultStringValue("(D)Clean")
    String cleanAllButtonlabel();
    @DefaultStringValue("(D)_Clean All")
    String cleanAllMenulabel();
    @DefaultStringValue("(D)Clean all")
    String cleanAllDesc();
    
    // Command: buildSourcePackage
    @DefaultStringValue("(D)Build _Source Package")
    String buildSourcePackageMenulabel();
    @DefaultStringValue("(D)Build a source package")
    String buildSourcePackageDesc();
    
    // Command: buildBinaryPackage
    @DefaultStringValue("(D)Build Binar_y Package")
    String buildBinaryPackageMenulabel();
    @DefaultStringValue("(D)Build a binary package")
    String buildBinaryPackageDesc();
    
    // Command: devtoolsLoadAll
    @DefaultStringValue("(D)Execute devtools::load_all()")
    String devtoolsLoadAllLabel();
    @DefaultStringValue("(D)_Load All")
    String devtoolsLoadAllMenulabel();
    @DefaultStringValue("(D)Execute devtools::load_all")
    String devtoolsLoadAllDesc();
    
    // Command: roxygenizePackage
    @DefaultStringValue("(D)Build Package Documentation")
    String roxygenizePackageLabel();
    @DefaultStringValue("(D)_Document")
    String roxygenizePackageMenulabel();
    @DefaultStringValue("(D)Build package documentation")
    String roxygenizePackageDesc();
    
    // Command: checkPackage
    @DefaultStringValue("(D)Check")
    String checkPackageButtonlabel();
    @DefaultStringValue("(D)_Check Package")
    String checkPackageMenulabel();
    @DefaultStringValue("(D)R CMD check")
    String checkPackageDesc();
    
    // Command: testPackage
    @DefaultStringValue("(D)_Test Package")
    String testPackageMenulabel();
    @DefaultStringValue("(D)Run tests for package")
    String testPackageDesc();
    
    // Command: testTestthatFile
    @DefaultStringValue("(D)Run testthat Tests")
    String testTestthatFileLabel();
    @DefaultStringValue("(D)Run Tests")
    String testTestthatFileButtonlabel();
    @DefaultStringValue("(D)Run tests for file")
    String testTestthatFileMenulabel();
    @DefaultStringValue("(D)Run tests using the testthat package")
    String testTestthatFileDesc();
    
    // Command: testShinytestFile
    @DefaultStringValue("(D)Run shinytest Test")
    String testShinytestFileLabel();
    @DefaultStringValue("(D)Run Test")
    String testShinytestFileButtonlabel();
    @DefaultStringValue("(D)Run test for file")
    String testShinytestFileMenulabel();
    @DefaultStringValue("(D)Run test using the shinytest package")
    String testShinytestFileDesc();
    
    // Command: stopBuild
    @DefaultStringValue("(D)Sto_p Build")
    String stopBuildMenulabel();
    @DefaultStringValue("(D)Stop the current build")
    String stopBuildDesc();
    
    // Command: buildToolsProjectSetup
    @DefaultStringValue("(D)Configure Build Tools...")
    String buildToolsProjectSetupLabel();
    @DefaultStringValue("(D)Configure Build _Tools...")
    String buildToolsProjectSetupMenulabel();
    @DefaultStringValue("(D)Configure build tools")
    String buildToolsProjectSetupDesc();
    
    // Command: refreshEnvironment
    @DefaultStringValue("(D)_Refresh Environment")
    String refreshEnvironmentMenulabel();
    @DefaultStringValue("(D)Refresh the list of objects in the environment")
    String refreshEnvironmentDesc();
    
    // Command: undoDummy
    @DefaultStringValue("(D)_Undo")
    String undoDummyMenulabel();
    
    // Command: redoDummy
    @DefaultStringValue("(D)Re_do")
    String redoDummyMenulabel();
    
    // Command: cutDummy
    @DefaultStringValue("(D)Cu_t")
    String cutDummyMenulabel();
    
    // Command: copyDummy
    @DefaultStringValue("(D)_Copy")
    String copyDummyMenulabel();
    
    // Command: pasteDummy
    @DefaultStringValue("(D)_Paste")
    String pasteDummyMenulabel();
    
    // Command: pasteWithIndentDummy
    @DefaultStringValue("(D)Pa_ste with Indent")
    String pasteWithIndentDummyMenulabel();
    
    // Command: yankBeforeCursor
    @DefaultStringValue("(D)Yank Before Cursor")
    String yankBeforeCursorLabel();
    
    // Command: yankAfterCursor
    @DefaultStringValue("(D)Yank After Cursor")
    String yankAfterCursorLabel();
    
    // Command: pasteLastYank
    @DefaultStringValue("(D)Paste Last Yank")
    String pasteLastYankLabel();
    
    // Command: insertAssignmentOperator
    @DefaultStringValue("(D)Insert Assignment Operator")
    String insertAssignmentOperatorLabel();
    
    // Command: insertPipeOperator
    @DefaultStringValue("(D)Insert Pipe Operator")
    String insertPipeOperatorLabel();
    
    // Command: openNextFileOnFilesystem
    @DefaultStringValue("(D)Open Next File on Filesystem")
    String openNextFileOnFilesystemLabel();
    
    // Command: openPreviousFileOnFilesystem
    @DefaultStringValue("(D)Open Previous File on Filesystem")
    String openPreviousFileOnFilesystemLabel();
    
    // Command: toggleSoftWrapMode
    @DefaultStringValue("(D)Toggle Soft Wrap Mode")
    String toggleSoftWrapModeLabel();
    @DefaultStringValue("(D)Soft _Wrap Long Lines")
    String toggleSoftWrapModeMenulabel();
    
    // Command: toggleRainbowParens
    @DefaultStringValue("(D)Toggle Rainbow Parentheses Mode")
    String toggleRainbowParensLabel();
    @DefaultStringValue("(D)Rain_bow Parentheses")
    String toggleRainbowParensMenulabel();
    
    // Command: maximizeConsole
    @DefaultStringValue("(D)Maximize Console")
    String maximizeConsoleMenulabel();
    
    // Command: debugBreakpoint
    @DefaultStringValue("(D)Toggle Breakpoint on Current Line")
    String debugBreakpointLabel();
    @DefaultStringValue("(D)Toggle _Breakpoint")
    String debugBreakpointMenulabel();
    @DefaultStringValue("(D)Set or remove a breakpoint on the current line of code")
    String debugBreakpointDesc();
    
    // Command: debugClearBreakpoints
    @DefaultStringValue("(D)Clear All Breakpoints...")
    String debugClearBreakpointsLabel();
    @DefaultStringValue("(D)Clear _All Breakpoints...")
    String debugClearBreakpointsMenulabel();
    @DefaultStringValue("(D)Remove all the breakpoints in the current project")
    String debugClearBreakpointsDesc();
    
    // Command: debugContinue
    @DefaultStringValue("(D)Continue Execution")
    String debugContinueLabel();
    @DefaultStringValue("(D)Continue")
    String debugContinueButtonlabel();
    @DefaultStringValue("(D)_Continue")
    String debugContinueMenulabel();
    @DefaultStringValue("(D)Continue execution until the next breakpoint is encountered")
    String debugContinueDesc();
    
    // Command: debugStop
    @DefaultStringValue("(D)Stop Debugging")
    String debugStopLabel();
    @DefaultStringValue("(D)Stop")
    String debugStopButtonlabel();
    @DefaultStringValue("(D)_Stop Debugging")
    String debugStopMenulabel();
    @DefaultStringValue("(D)Exit debug mode")
    String debugStopDesc();
    
    // Command: debugStep
    @DefaultStringValue("(D)Execute Next Line")
    String debugStepLabel();
    @DefaultStringValue("(D)Next")
    String debugStepButtonlabel();
    @DefaultStringValue("(D)E_xecute Next Line")
    String debugStepMenulabel();
    @DefaultStringValue("(D)Execute the next line of code")
    String debugStepDesc();
    
    // Command: debugStepInto
    @DefaultStringValue("(D)Step Into Function")
    String debugStepIntoLabel();
    @DefaultStringValue("(D)")
    String debugStepIntoButtonlabel();
    @DefaultStringValue("(D)Step _Into Function")
    String debugStepIntoMenulabel();
    @DefaultStringValue("(D)Step into the current function call")
    String debugStepIntoDesc();
    
    // Command: debugFinish
    @DefaultStringValue("(D)Finish Function/Loop")
    String debugFinishLabel();
    @DefaultStringValue("(D)")
    String debugFinishButtonlabel();
    @DefaultStringValue("(D)_Finish Function/Loop")
    String debugFinishMenulabel();
    @DefaultStringValue("(D)Execute the remainder of the current function or loop")
    String debugFinishDesc();
    
    // Command: debugHelp
    @DefaultStringValue("(D)Show Guide on Debugging with RStudio")
    String debugHelpLabel();
    @DefaultStringValue("(D)Debugging _Help")
    String debugHelpMenulabel();
    @DefaultStringValue("(D)Guide to debugging features")
    String debugHelpDesc();
    
    // Command: errorsMessage
    @DefaultStringValue("(D)_Message Only")
    String errorsMessageMenulabel();
    @DefaultStringValue("(D)Print the error message when an unhandled error occurs")
    String errorsMessageDesc();
    
    // Command: errorsTraceback
    @DefaultStringValue("(D)_Error Inspector")
    String errorsTracebackMenulabel();
    @DefaultStringValue("(D)Show the error inspector when an unhandled error occurs")
    String errorsTracebackDesc();
    
    // Command: errorsBreak
    @DefaultStringValue("(D)_Break in Code")
    String errorsBreakMenulabel();
    @DefaultStringValue("(D)Break when any unhandled error occurs")
    String errorsBreakDesc();
    
    // Command: startProfiler
    @DefaultStringValue("(D)_Start Profiling")
    String startProfilerMenulabel();
    @DefaultStringValue("(D)Start profiling R code")
    String startProfilerDesc();
    
    // Command: stopProfiler
    @DefaultStringValue("(D)Stop Profiling")
    String stopProfilerButtonlabel();
    @DefaultStringValue("(D)Stop Profilin_g")
    String stopProfilerMenulabel();
    @DefaultStringValue("(D)Stop profiling R code")
    String stopProfilerDesc();
    
    // Command: profileCode
    @DefaultStringValue("(D)Profile Current Line or Selection")
    String profileCodeLabel();
    @DefaultStringValue("(D)")
    String profileCodeButtonlabel();
    @DefaultStringValue("(D)_Profile Selected Line(s)")
    String profileCodeMenulabel();
    @DefaultStringValue("(D)Profile the current line or selection")
    String profileCodeDesc();
    
    // Command: gotoProfileSource
    @DefaultStringValue("(D)Go To Profile Sources")
    String gotoProfileSourceLabel();
    @DefaultStringValue("(D)")
    String gotoProfileSourceButtonlabel();
    @DefaultStringValue("(D)Open sources associated with the selection")
    String gotoProfileSourceDesc();
    
    // Command: profileCodeWithoutFocus
    @DefaultStringValue("(D)Profile Current Line or Selection Without Focus")
    String profileCodeWithoutFocusLabel();
    
    // Command: openProfile
    @DefaultStringValue("(D)Open Profile...")
    String openProfileLabel();
    @DefaultStringValue("(D)_Open Profile...")
    String openProfileMenulabel();
    @DefaultStringValue("(D)Opens a profile from a file")
    String openProfileDesc();
    
    // Command: saveProfileAs
    @DefaultStringValue("(D)Save Profile As...")
    String saveProfileAsLabel();
    @DefaultStringValue("(D)")
    String saveProfileAsButtonlabel();
    @DefaultStringValue("(D)_Save Profile As...")
    String saveProfileAsMenulabel();
    @DefaultStringValue("(D)Saves current profile into a file")
    String saveProfileAsDesc();
    
    // Command: openProfileInBrowser
    @DefaultStringValue("(D)Open Profile in Browser...")
    String openProfileInBrowserLabel();
    @DefaultStringValue("(D)")
    String openProfileInBrowserButtonlabel();
    @DefaultStringValue("(D)_Open Profile in Browser")
    String openProfileInBrowserMenulabel();
    @DefaultStringValue("(D)Opens current profile in a web browser")
    String openProfileInBrowserDesc();
    
    // Command: profileHelp
    @DefaultStringValue("(D)Show Guide on Profiling with RStudio")
    String profileHelpLabel();
    @DefaultStringValue("(D)Profiling _Help")
    String profileHelpMenulabel();
    @DefaultStringValue("(D)Guide to profiling features")
    String profileHelpDesc();
    
    // Command: reloadShinyApp
    @DefaultStringValue("(D)Reload Shiny Application")
    String reloadShinyAppLabel();
    @DefaultStringValue("(D)")
    String reloadShinyAppButtonlabel();
    @DefaultStringValue("(D)Reload")
    String reloadShinyAppMenulabel();
    @DefaultStringValue("(D)Reload the Shiny application")
    String reloadShinyAppDesc();
    
    // Command: shinyRunInPane
    @DefaultStringValue("(D)Run Shiny Application in New Pane")
    String shinyRunInPaneLabel();
    @DefaultStringValue("(D)Run in Viewer Pane")
    String shinyRunInPaneMenulabel();
    @DefaultStringValue("(D)Run the Shiny application in an RStudio pane")
    String shinyRunInPaneDesc();
    
    // Command: shinyRunInViewer
    @DefaultStringValue("(D)Run Shiny Application in RStudio Viewer")
    String shinyRunInViewerLabel();
    @DefaultStringValue("(D)Run in Window")
    String shinyRunInViewerMenulabel();
    @DefaultStringValue("(D)Run the Shiny application in an RStudio viewer window")
    String shinyRunInViewerDesc();
    
    // Command: shinyRunInBrowser
    @DefaultStringValue("(D)Run Shiny Application in Web Browser")
    String shinyRunInBrowserLabel();
    @DefaultStringValue("(D)Run External")
    String shinyRunInBrowserMenulabel();
    @DefaultStringValue("(D)Run the Shiny application in the system's default Web browser")
    String shinyRunInBrowserDesc();
    
    // Command: shinyRecordTest
    @DefaultStringValue("(D)Record a test for Shiny")
    String shinyRecordTestLabel();
    @DefaultStringValue("(D)Record Test")
    String shinyRecordTestButtonlabel();
    @DefaultStringValue("(D)Record Test")
    String shinyRecordTestMenulabel();
    @DefaultStringValue("(D)Record test for Shiny application")
    String shinyRecordTestDesc();
    
    // Command: shinyRunAllTests
    @DefaultStringValue("(D)Run tests for Shiny application")
    String shinyRunAllTestsLabel();
    @DefaultStringValue("(D)Run Tests")
    String shinyRunAllTestsButtonlabel();
    @DefaultStringValue("(D)Run Tests")
    String shinyRunAllTestsMenulabel();
    @DefaultStringValue("(D)Run tests for Shiny application")
    String shinyRunAllTestsDesc();
    
    // Command: shinyCompareTest
    @DefaultStringValue("(D)Compare test results for Shiny application")
    String shinyCompareTestLabel();
    @DefaultStringValue("(D)Compare Results")
    String shinyCompareTestButtonlabel();
    @DefaultStringValue("(D)Compare Results")
    String shinyCompareTestMenulabel();
    @DefaultStringValue("(D)Compare test results for Shiny application")
    String shinyCompareTestDesc();
    
    // Command: reloadPlumberAPI
    @DefaultStringValue("(D)Reload Plumber API")
    String reloadPlumberAPILabel();
    @DefaultStringValue("(D)")
    String reloadPlumberAPIButtonlabel();
    @DefaultStringValue("(D)Reload")
    String reloadPlumberAPIMenulabel();
    @DefaultStringValue("(D)Reload the Plumber API")
    String reloadPlumberAPIDesc();
    
    // Command: plumberRunInPane
    @DefaultStringValue("(D)Run Plumber API in New Pane")
    String plumberRunInPaneLabel();
    @DefaultStringValue("(D)Run in Viewer Pane")
    String plumberRunInPaneMenulabel();
    @DefaultStringValue("(D)Run the Plumber API in an RStudio pane")
    String plumberRunInPaneDesc();
    
    // Command: plumberRunInViewer
    @DefaultStringValue("(D)Run Plumber API in RStudio Viewer")
    String plumberRunInViewerLabel();
    @DefaultStringValue("(D)Run in Window")
    String plumberRunInViewerMenulabel();
    @DefaultStringValue("(D)Run the Plumber API in an RStudio viewer window")
    String plumberRunInViewerDesc();
    
    // Command: plumberRunInBrowser
    @DefaultStringValue("(D)Run Plumber API in Web Browser")
    String plumberRunInBrowserLabel();
    @DefaultStringValue("(D)Run External")
    String plumberRunInBrowserMenulabel();
    @DefaultStringValue("(D)Run the Plumber API in the system's default Web browser")
    String plumberRunInBrowserDesc();
    
    // Command: rsconnectDeploy
    @DefaultStringValue("(D)P_ublish...")
    String rsconnectDeployMenulabel();
    @DefaultStringValue("(D)Publish the application or document")
    String rsconnectDeployDesc();
    
    // Command: rsconnectConfigure
    @DefaultStringValue("(D)_Configure Application...")
    String rsconnectConfigureMenulabel();
    @DefaultStringValue("(D)Configure the application")
    String rsconnectConfigureDesc();
    
    // Command: rsconnectManageAccounts
    @DefaultStringValue("(D)_Manage Accounts...")
    String rsconnectManageAccountsMenulabel();
    @DefaultStringValue("(D)Connect or disconnect accounts")
    String rsconnectManageAccountsDesc();
    
    // Command: showGpuDiagnostics
    @DefaultStringValue("(D)Show _GPU Diagnostics")
    String showGpuDiagnosticsMenulabel();
    
    // Command: toggleEditorTokenInfo
    @DefaultStringValue("(D)_Toggle Editor Token Information")
    String toggleEditorTokenInfoMenulabel();
    
    // Command: showDomElements
    @DefaultStringValue("(D)_Show DOM Elements")
    String showDomElementsMenulabel();
    
    // Command: newConnection
    @DefaultStringValue("(D)New Connection")
    String newConnectionButtonlabel();
    @DefaultStringValue("(D)New Connection...")
    String newConnectionMenulabel();
    @DefaultStringValue("(D)Create a new connection")
    String newConnectionDesc();
    
    // Command: removeConnection
    @DefaultStringValue("(D)")
    String removeConnectionButtonlabel();
    @DefaultStringValue("(D)Remove Connection...")
    String removeConnectionMenulabel();
    @DefaultStringValue("(D)Remove connection from the connection history")
    String removeConnectionDesc();
    
    // Command: disconnectConnection
    @DefaultStringValue("(D)Disconnect")
    String disconnectConnectionMenulabel();
    @DefaultStringValue("(D)Disconnect from a connection")
    String disconnectConnectionDesc();
    
    // Command: refreshConnection
    @DefaultStringValue("(D)Refresh Connection Data")
    String refreshConnectionLabel();
    @DefaultStringValue("(D)Refresh")
    String refreshConnectionMenulabel();
    @DefaultStringValue("(D)Refresh data")
    String refreshConnectionDesc();
    
    // Command: sparkLog
    @DefaultStringValue("(D)View Spark Log")
    String sparkLogLabel();
    @DefaultStringValue("(D)Log")
    String sparkLogButtonlabel();
    @DefaultStringValue("(D)Spark Log")
    String sparkLogMenulabel();
    @DefaultStringValue("(D)View the log for the Spark connection")
    String sparkLogDesc();
    
    // Command: sparkUI
    @DefaultStringValue("(D)SparkUI")
    String sparkUIButtonlabel();
    @DefaultStringValue("(D)SparkUI")
    String sparkUIMenulabel();
    @DefaultStringValue("(D)View the browser UI for the Spark connection")
    String sparkUIDesc();
    
    // Command: sparkHelp
    @DefaultStringValue("(D)")
    String sparkHelpButtonlabel();
    @DefaultStringValue("(D)Using Spark with RStudio")
    String sparkHelpMenulabel();
    @DefaultStringValue("(D)Help on using Spark with RStudio")
    String sparkHelpDesc();
    
    // Command: startJob
    @DefaultStringValue("(D)Start Local Job")
    String startJobButtonlabel();
    @DefaultStringValue("(D)_Start Local Job...")
    String startJobMenulabel();
    @DefaultStringValue("(D)Run a background local job")
    String startJobDesc();
    
    // Command: sourceAsJob
    @DefaultStringValue("(D)Source as Local Job...")
    String sourceAsJobMenulabel();
    @DefaultStringValue("(D)Run the current R script as a local job")
    String sourceAsJobDesc();
    
    // Command: clearJobs
    @DefaultStringValue("(D)_Clear Local Jobs")
    String clearJobsMenulabel();
    @DefaultStringValue("(D)Clean up all completed local jobs")
    String clearJobsDesc();
    
    // Command: runSelectionAsJob
    @DefaultStringValue("(D)Ru_n Selection as Local Job")
    String runSelectionAsJobMenulabel();
    @DefaultStringValue("(D)Run the selected code as a local job")
    String runSelectionAsJobDesc();
    
    // Command: startLauncherJob
    @DefaultStringValue("(D)Start Launcher Job")
    String startLauncherJobButtonlabel();
    @DefaultStringValue("(D)Start Launcher _Job...")
    String startLauncherJobMenulabel();
    @DefaultStringValue("(D)Run a background job on a cluster")
    String startLauncherJobDesc();
    
    // Command: sourceAsLauncherJob
    @DefaultStringValue("(D)Source as Launcher Job...")
    String sourceAsLauncherJobMenulabel();
    @DefaultStringValue("(D)Run the current R script on a cluster")
    String sourceAsLauncherJobDesc();
    
    // Command: runSelectionAsLauncherJob
    @DefaultStringValue("(D)Run Selection as _Launcher Job")
    String runSelectionAsLauncherJobMenulabel();
    @DefaultStringValue("(D)Run the selected code as a launcher job")
    String runSelectionAsLauncherJobDesc();
    
    // Command: sortLauncherJobsRecorded
    @DefaultStringValue("(D)Sort by Submission Time")
    String sortLauncherJobsRecordedMenulabel();
    @DefaultStringValue("(D)Sort jobs by time submitted")
    String sortLauncherJobsRecordedDesc();
    
    // Command: sortLauncherJobsState
    @DefaultStringValue("(D)Sort by Job State")
    String sortLauncherJobsStateMenulabel();
    @DefaultStringValue("(D)Sort jobs by current state")
    String sortLauncherJobsStateDesc();
    
    // Command: showFileMenu
    @DefaultStringValue("(D)Show File Menu")
    String showFileMenuMenulabel();
    
    // Command: showEditMenu
    @DefaultStringValue("(D)Show Edit Menu")
    String showEditMenuMenulabel();
    
    // Command: showCodeMenu
    @DefaultStringValue("(D)Show Code Menu")
    String showCodeMenuMenulabel();
    
    // Command: showViewMenu
    @DefaultStringValue("(D)Show View Menu")
    String showViewMenuMenulabel();
    
    // Command: showPlotsMenu
    @DefaultStringValue("(D)Show Plots Menu")
    String showPlotsMenuMenulabel();
    
    // Command: showSessionMenu
    @DefaultStringValue("(D)Show Session Menu")
    String showSessionMenuMenulabel();
    
    // Command: showBuildMenu
    @DefaultStringValue("(D)Show Build Menu")
    String showBuildMenuMenulabel();
    
    // Command: showDebugMenu
    @DefaultStringValue("(D)Show Debug Menu")
    String showDebugMenuMenulabel();
    
    // Command: showProfileMenu
    @DefaultStringValue("(D)Show Profile Menu")
    String showProfileMenuMenulabel();
    
    // Command: showToolsMenu
    @DefaultStringValue("(D)Show Tools Menu")
    String showToolsMenuMenulabel();
    
    // Command: showHelpMenu
    @DefaultStringValue("(D)Show Help Menu")
    String showHelpMenuMenulabel();
    
    // Command: editUserPrefs
    @DefaultStringValue("(D)_Edit User Prefs File")
    String editUserPrefsMenulabel();
    
    // Command: clearUserPrefs
    @DefaultStringValue("(D)_Clear User Prefs")
    String clearUserPrefsMenulabel();
    
    // Command: viewAllPrefs
    @DefaultStringValue("(D)_View All Prefs")
    String viewAllPrefsMenulabel();
    
    // Command: toggleScreenReaderSupport
    @DefaultStringValue("(D)_Screen Reader Support")
    String toggleScreenReaderSupportMenulabel();
    
    // Command: showAccessibilityHelp
    @DefaultStringValue("(D)Accessibility _Help...")
    String showAccessibilityHelpMenulabel();
    
    // Command: toggleTabKeyMovesFocus
    @DefaultStringValue("(D)_Tab Key Always Moves Focus")
    String toggleTabKeyMovesFocusMenulabel();
    
    // Command: focusMainToolbar
    @DefaultStringValue("(D)Focus _Main Toolbar")
    String focusMainToolbarMenulabel();
    
    // Command: focusConsoleOutputEnd
    @DefaultStringValue("(D)_Focus Console Output")
    String focusConsoleOutputEndMenulabel();
    
    // Command: focusNextPane
    @DefaultStringValue("(D)_Focus Next Pane")
    String focusNextPaneMenulabel();
    
    // Command: focusPreviousPane
    @DefaultStringValue("(D)_Focus Previous Pane")
    String focusPreviousPaneMenulabel();
    
    // Command: signOut
    @DefaultStringValue("(D)Sign Out")
    String signOutLabel();
    @DefaultStringValue("(D)")
    String signOutButtonlabel();
    @DefaultStringValue("(D)Sign Ou_t")
    String signOutMenulabel();
    @DefaultStringValue("(D)Sign out from RStudio")
    String signOutDesc();
    
    // Command: loadServerHome
    @DefaultStringValue("(D)")
    String loadServerHomeButtonlabel();
    @DefaultStringValue("(D)RStudio Server _Home")
    String loadServerHomeMenulabel();
    
    // Command: speakEditorLocation
    @DefaultStringValue("(D)Speak Text _Editor Location")
    String speakEditorLocationMenulabel();
    
    // Command: focusLeftSeparator
    @DefaultStringValue("(D)A_djust Left Splitter")
    String focusLeftSeparatorMenulabel();
    
    // Command: focusRightSeparator
    @DefaultStringValue("(D)Ad_just Right Splitter")
    String focusRightSeparatorMenulabel();
    
    // Command: focusCenterSeparator
    @DefaultStringValue("(D)Adjust Center S_plitter")
    String focusCenterSeparatorMenulabel();
    
    // Command: focusSourceColumnSeparator
    @DefaultStringValue("(D)Adjust Source Column Spli_tter")
    String focusSourceColumnSeparatorMenulabel();
    
    // Command: showShortcutCommand
    @DefaultStringValue("(D)Show _Keyboard Shortcut Commands")
    String showShortcutCommandMenulabel();
    
    // Command: showCommandPalette
    @DefaultStringValue("(D)Show Command Palette")
    String showCommandPaletteLabel();
    @DefaultStringValue("(D)Show _Command Palette")
    String showCommandPaletteMenulabel();
    
    // Command: clearCommandPaletteMru
    @DefaultStringValue("(D)Clear Recently Executed Command List")
    String clearCommandPaletteMruMenulabel();
    
    // Command: freeUnusedMemory
    @DefaultStringValue("(D)_Free Unused R Memory")
    String freeUnusedMemoryMenulabel();
    
    // Command: showMemoryUsageReport
    @DefaultStringValue("(D)Memory Usage _Report...")
    String showMemoryUsageReportMenulabel();
    
    // Command: toggleShowMemoryUsage
    @DefaultStringValue("(D)Toggle Memory Usage Display in Environment Pane")
    String toggleShowMemoryUsageLabel();
    @DefaultStringValue("(D)_Show Current Memory Usage")
    String toggleShowMemoryUsageMenulabel();
    
}