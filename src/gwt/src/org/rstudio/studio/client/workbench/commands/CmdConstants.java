package org.rstudio.studio.client.workbench.commands;
import com.google.gwt.i18n.client.Constants;

public interface CmdConstants extends Constants {
    // setWorkingDirToProjectDir
    @DefaultStringValue("@dSet Working Directory to Project Directory")
    String setWorkingDirToProjectDirLabel();
    @DefaultStringValue("@d")
    String setWorkingDirToProjectDirButtonLabel();
    @DefaultStringValue("@dTo _Project Directory")
    String setWorkingDirToProjectDirMenuLabel();
    @DefaultStringValue("@dChange working directory to project root directory")
    String setWorkingDirToProjectDirDesc();
    
    // setWorkingDirToActiveDoc
    @DefaultStringValue("@dSet Working Directory to Current Document's Directory")
    String setWorkingDirToActiveDocLabel();
    @DefaultStringValue("@d")
    String setWorkingDirToActiveDocButtonLabel();
    @DefaultStringValue("@dTo _Source File Location")
    String setWorkingDirToActiveDocMenuLabel();
    @DefaultStringValue("@dChange working directory to path of active document")
    String setWorkingDirToActiveDocDesc();
    
    // setWorkingDirToFilesPane
    @DefaultStringValue("@dSet Working Directory to Directory in Files Pane")
    String setWorkingDirToFilesPaneLabel();
    @DefaultStringValue("@d")
    String setWorkingDirToFilesPaneButtonLabel();
    @DefaultStringValue("@dTo _Files Pane Location")
    String setWorkingDirToFilesPaneMenuLabel();
    @DefaultStringValue("@dChange working directory to location of Files pane")
    String setWorkingDirToFilesPaneDesc();
    
    // setWorkingDir
    @DefaultStringValue("@dSet Working Directory...")
    String setWorkingDirLabel();
    @DefaultStringValue("@d")
    String setWorkingDirButtonLabel();
    @DefaultStringValue("@d_Choose Directory...")
    String setWorkingDirMenuLabel();
    @DefaultStringValue("@dSelect and change to a new working directory")
    String setWorkingDirDesc();
    
    // newSourceDoc
    @DefaultStringValue("@dCreate a New R Script")
    String newSourceDocLabel();
    @DefaultStringValue("@d")
    String newSourceDocButtonLabel();
    @DefaultStringValue("@d_R Script")
    String newSourceDocMenuLabel();
    @DefaultStringValue("@dCreate a new R script")
    String newSourceDocDesc();
    
    // newRNotebook
    @DefaultStringValue("@dR _Notebook")
    String newRNotebookMenuLabel();
    @DefaultStringValue("@dCreate a new R Markdown notebook")
    String newRNotebookDesc();
    
    // newTextDoc
    @DefaultStringValue("@d_Text File")
    String newTextDocMenuLabel();
    @DefaultStringValue("@dCreate a new text file")
    String newTextDocDesc();
    
    // newCDoc
    @DefaultStringValue("@d_C File")
    String newCDocMenuLabel();
    @DefaultStringValue("@dCreate a new C file")
    String newCDocDesc();
    
    // newCppDoc
    @DefaultStringValue("@d_C++ File")
    String newCppDocMenuLabel();
    @DefaultStringValue("@dCreate a new C++ file")
    String newCppDocDesc();
    
    // newHeaderDoc
    @DefaultStringValue("@d_Header File")
    String newHeaderDocMenuLabel();
    @DefaultStringValue("@dCreate a new header file")
    String newHeaderDocDesc();
    
    // newMarkdownDoc
    @DefaultStringValue("@d_Markdown File")
    String newMarkdownDocMenuLabel();
    @DefaultStringValue("@dCreate a new Markdown document")
    String newMarkdownDocDesc();
    
    // newPythonDoc
    @DefaultStringValue("@d_Python Script")
    String newPythonDocMenuLabel();
    @DefaultStringValue("@dCreate a new Python script")
    String newPythonDocDesc();
    
    // newShellDoc
    @DefaultStringValue("@d_Shell Script")
    String newShellDocMenuLabel();
    @DefaultStringValue("@dCreate a new shell script")
    String newShellDocDesc();
    
    // newStanDoc
    @DefaultStringValue("@d_Stan File")
    String newStanDocMenuLabel();
    @DefaultStringValue("@dCreate a new Stan program")
    String newStanDocDesc();
    
    // newHtmlDoc
    @DefaultStringValue("@d_HTML File")
    String newHtmlDocMenuLabel();
    @DefaultStringValue("@dCreate a new HTML file")
    String newHtmlDocDesc();
    
    // newJavaScriptDoc
    @DefaultStringValue("@d_JavaScript File")
    String newJavaScriptDocMenuLabel();
    @DefaultStringValue("@dCreate a new JavaScript file")
    String newJavaScriptDocDesc();
    
    // newCssDoc
    @DefaultStringValue("@d_CSS File")
    String newCssDocMenuLabel();
    @DefaultStringValue("@dCreate a new CSS file")
    String newCssDocDesc();
    
    // newD3Doc
    @DefaultStringValue("@d_D3 Script")
    String newD3DocMenuLabel();
    @DefaultStringValue("@dCreate a new D3 Script")
    String newD3DocDesc();
    
    // newRPlumberDoc
    @DefaultStringValue("@dPlumber _API...")
    String newRPlumberDocMenuLabel();
    @DefaultStringValue("@dCreate a new Plumber API")
    String newRPlumberDocDesc();
    
    // rcppHelp
    @DefaultStringValue("@dHelp on using Rcpp")
    String rcppHelpDesc();
    
    // printCppCompletions
    @DefaultStringValue("@dPrint C++ Completions")
    String printCppCompletionsDesc();
    
    // newSweaveDoc
    @DefaultStringValue("@dR _Sweave")
    String newSweaveDocMenuLabel();
    @DefaultStringValue("@dCreate a new R Sweave document")
    String newSweaveDocDesc();
    
    // newRMarkdownDoc
    @DefaultStringValue("@dR _Markdown...")
    String newRMarkdownDocMenuLabel();
    @DefaultStringValue("@dCreate a new R Markdown document")
    String newRMarkdownDocDesc();
    
    // newRShinyApp
    @DefaultStringValue("@dShiny _Web App...")
    String newRShinyAppMenuLabel();
    @DefaultStringValue("@dCreate a new Shiny web application")
    String newRShinyAppDesc();
    
    // newRHTMLDoc
    @DefaultStringValue("@dR _HTML")
    String newRHTMLDocMenuLabel();
    @DefaultStringValue("@dCreate a new R HTML document")
    String newRHTMLDocDesc();
    
    // newRPresentationDoc
    @DefaultStringValue("@dR _Presentation")
    String newRPresentationDocMenuLabel();
    @DefaultStringValue("@dCreate a new R presentation")
    String newRPresentationDocDesc();
    
    // newRDocumentationDoc
    @DefaultStringValue("@dR Doc_umentation...")
    String newRDocumentationDocMenuLabel();
    @DefaultStringValue("@dCreate a new Rd documentation file")
    String newRDocumentationDocDesc();
    
    // newSqlDoc
    @DefaultStringValue("@dS_QL Script")
    String newSqlDocMenuLabel();
    @DefaultStringValue("@dCreate a new SQL script")
    String newSqlDocDesc();
    
    // openSourceDoc
    @DefaultStringValue("@dOpen File...")
    String openSourceDocLabel();
    @DefaultStringValue("@d")
    String openSourceDocButtonLabel();
    @DefaultStringValue("@d_Open File...")
    String openSourceDocMenuLabel();
    @DefaultStringValue("@dOpen an existing file")
    String openSourceDocDesc();
    
    // openSourceDocNewColumn
    @DefaultStringValue("@dOpen File in New Column...")
    String openSourceDocNewColumnLabel();
    @DefaultStringValue("@d")
    String openSourceDocNewColumnButtonLabel();
    @DefaultStringValue("@dOpen File in New C_olumn...")
    String openSourceDocNewColumnMenuLabel();
    @DefaultStringValue("@dOpen an existing file in a new column")
    String openSourceDocNewColumnDesc();
    
    // reopenSourceDocWithEncoding
    @DefaultStringValue("@dReopen Current Document with Encoding...")
    String reopenSourceDocWithEncodingLabel();
    @DefaultStringValue("@d")
    String reopenSourceDocWithEncodingButtonLabel();
    @DefaultStringValue("@dReopen with _Encoding...")
    String reopenSourceDocWithEncodingMenuLabel();
    @DefaultStringValue("@dReopen the current file with a different encoding")
    String reopenSourceDocWithEncodingDesc();
    
    // saveSourceDoc
    @DefaultStringValue("@dSave Current Document")
    String saveSourceDocLabel();
    @DefaultStringValue("@d")
    String saveSourceDocButtonLabel();
    @DefaultStringValue("@d_Save")
    String saveSourceDocMenuLabel();
    @DefaultStringValue("@dSave current document")
    String saveSourceDocDesc();
    
    // renameSourceDoc
    @DefaultStringValue("@dRename Current Document")
    String renameSourceDocLabel();
    @DefaultStringValue("@d")
    String renameSourceDocButtonLabel();
    @DefaultStringValue("@d_Rename")
    String renameSourceDocMenuLabel();
    @DefaultStringValue("@dRename current document")
    String renameSourceDocDesc();
    
    // copySourceDocPath
    @DefaultStringValue("@dCopy Document Path")
    String copySourceDocPathLabel();
    @DefaultStringValue("@d")
    String copySourceDocPathButtonLabel();
    @DefaultStringValue("@dCopy Path")
    String copySourceDocPathMenuLabel();
    @DefaultStringValue("@dCopy current document path")
    String copySourceDocPathDesc();
    
    // saveSourceDocAs
    @DefaultStringValue("@dSave Current Document As...")
    String saveSourceDocAsLabel();
    @DefaultStringValue("@dSave as")
    String saveSourceDocAsButtonLabel();
    @DefaultStringValue("@dSave _As...")
    String saveSourceDocAsMenuLabel();
    @DefaultStringValue("@dSave current file to a specific path")
    String saveSourceDocAsDesc();
    
    // saveAllSourceDocs
    @DefaultStringValue("@dSave All Source Documents")
    String saveAllSourceDocsLabel();
    @DefaultStringValue("@d")
    String saveAllSourceDocsButtonLabel();
    @DefaultStringValue("@dSa_ve All")
    String saveAllSourceDocsMenuLabel();
    @DefaultStringValue("@dSave all open documents")
    String saveAllSourceDocsDesc();
    
    // saveSourceDocWithEncoding
    @DefaultStringValue("@dSave Current Document with Encoding...")
    String saveSourceDocWithEncodingLabel();
    @DefaultStringValue("@dSave wit_h Encoding...")
    String saveSourceDocWithEncodingMenuLabel();
    @DefaultStringValue("@dSave the current file with a different encoding")
    String saveSourceDocWithEncodingDesc();
    
    // closeSourceDoc
    @DefaultStringValue("@dClose Current Document")
    String closeSourceDocLabel();
    @DefaultStringValue("@d_Close")
    String closeSourceDocMenuLabel();
    
    // closeAllSourceDocs
    @DefaultStringValue("@dClose All Documents")
    String closeAllSourceDocsLabel();
    @DefaultStringValue("@dC_lose All")
    String closeAllSourceDocsMenuLabel();
    
    // closeOtherSourceDocs
    @DefaultStringValue("@dClose Other Documents")
    String closeOtherSourceDocsLabel();
    @DefaultStringValue("@dClose All E_xcept Current")
    String closeOtherSourceDocsMenuLabel();
    
    // vcsFileDiff
    @DefaultStringValue("@dShow Differences for File")
    String vcsFileDiffLabel();
    @DefaultStringValue("@d_Diff of")
    String vcsFileDiffMenuLabel();
    @DefaultStringValue("@dShow differences for the file")
    String vcsFileDiffDesc();
    
    // vcsFileLog
    @DefaultStringValue("@dShow Changelog for File")
    String vcsFileLogLabel();
    @DefaultStringValue("@d_Log of")
    String vcsFileLogMenuLabel();
    @DefaultStringValue("@dShow log of changes to the file")
    String vcsFileLogDesc();
    
    // vcsFileRevert
    @DefaultStringValue("@dRevert Changes to File")
    String vcsFileRevertLabel();
    @DefaultStringValue("@d_Revert")
    String vcsFileRevertMenuLabel();
    @DefaultStringValue("@dRevert changes to the file")
    String vcsFileRevertDesc();
    
    // vcsViewOnGitHub
    @DefaultStringValue("@dView file on GitHub")
    String vcsViewOnGitHubLabel();
    @DefaultStringValue("@d_View FILE on GitHub")
    String vcsViewOnGitHubMenuLabel();
    @DefaultStringValue("@dView this file on Github")
    String vcsViewOnGitHubDesc();
    
    // vcsBlameOnGitHub
    @DefaultStringValue("@dView 'git blame' on GitHub")
    String vcsBlameOnGitHubLabel();
    @DefaultStringValue("@d_Blame FILE on GitHub")
    String vcsBlameOnGitHubMenuLabel();
    @DefaultStringValue("@dBlame view for this file on Github")
    String vcsBlameOnGitHubDesc();
    
    // printSourceDoc
    @DefaultStringValue("@d")
    String printSourceDocButtonLabel();
    @DefaultStringValue("@dPr_int...")
    String printSourceDocMenuLabel();
    @DefaultStringValue("@dPrint the current file")
    String printSourceDocDesc();
    
    // popoutDoc
    @DefaultStringValue("@dShow Document in New Window")
    String popoutDocLabel();
    @DefaultStringValue("@d")
    String popoutDocButtonLabel();
    @DefaultStringValue("@dShow in new window")
    String popoutDocDesc();
    
    // returnDocToMain
    @DefaultStringValue("@dReturn Document to Main Window")
    String returnDocToMainLabel();
    @DefaultStringValue("@d")
    String returnDocToMainButtonLabel();
    @DefaultStringValue("@dReturn to main window")
    String returnDocToMainDesc();
    
    // mru0
    
    // mru1
    
    // mru2
    
    // mru3
    
    // mru4
    
    // mru5
    
    // mru6
    
    // mru7
    
    // mru8
    
    // mru9
    
    // mru10
    
    // mru11
    
    // mru12
    
    // mru13
    
    // mru14
    
    // clearRecentFiles
    @DefaultStringValue("@d_Clear List")
    String clearRecentFilesMenuLabel();
    
    // newProject
    @DefaultStringValue("@dCreate a New Project...")
    String newProjectLabel();
    @DefaultStringValue("@d")
    String newProjectButtonLabel();
    @DefaultStringValue("@dNew _Project...")
    String newProjectMenuLabel();
    @DefaultStringValue("@dCreate a project")
    String newProjectDesc();
    
    // openProject
    @DefaultStringValue("@dOpen Project...")
    String openProjectLabel();
    @DefaultStringValue("@d")
    String openProjectButtonLabel();
    @DefaultStringValue("@dOpe_n Project...")
    String openProjectMenuLabel();
    @DefaultStringValue("@dOpen a project")
    String openProjectDesc();
    
    // openProjectInNewWindow
    @DefaultStringValue("@dOpen Project with New R Session")
    String openProjectInNewWindowLabel();
    @DefaultStringValue("@d")
    String openProjectInNewWindowButtonLabel();
    @DefaultStringValue("@dOpen Project in Ne_w Session...")
    String openProjectInNewWindowMenuLabel();
    @DefaultStringValue("@dOpen project in a new R session")
    String openProjectInNewWindowDesc();
    
    // shareProject
    @DefaultStringValue("@dShare Project...")
    String shareProjectLabel();
    @DefaultStringValue("@d")
    String shareProjectButtonLabel();
    @DefaultStringValue("@dS_hare Project...")
    String shareProjectMenuLabel();
    @DefaultStringValue("@dShare this project with others")
    String shareProjectDesc();
    
    // openSharedProject
    @DefaultStringValue("@dOpen Shared Project")
    String openSharedProjectLabel();
    @DefaultStringValue("@dMore...")
    String openSharedProjectMenuLabel();
    @DefaultStringValue("@dOpen a project shared with you")
    String openSharedProjectDesc();
    
    // projectMru0
    
    // projectMru1
    
    // projectMru2
    
    // projectMru3
    
    // projectMru4
    
    // projectMru5
    
    // projectMru6
    
    // projectMru7
    
    // projectMru8
    
    // projectMru9
    
    // projectMru10
    
    // projectMru11
    
    // projectMru12
    
    // projectMru13
    
    // projectMru14
    
    // clearRecentProjects
    @DefaultStringValue("@d_Clear Project List")
    String clearRecentProjectsMenuLabel();
    
    // closeProject
    @DefaultStringValue("@dClose Current Project")
    String closeProjectLabel();
    @DefaultStringValue("@d")
    String closeProjectButtonLabel();
    @DefaultStringValue("@dClose Projec_t")
    String closeProjectMenuLabel();
    @DefaultStringValue("@dClose the currently open project")
    String closeProjectDesc();
    
    // projectOptions
    @DefaultStringValue("@dEdit Project Options...")
    String projectOptionsLabel();
    @DefaultStringValue("@d")
    String projectOptionsButtonLabel();
    @DefaultStringValue("@d_Project Options...")
    String projectOptionsMenuLabel();
    @DefaultStringValue("@dEdit options for the current project")
    String projectOptionsDesc();
    
    // projectSweaveOptions
    @DefaultStringValue("@d")
    String projectSweaveOptionsButtonLabel();
    @DefaultStringValue("@d")
    String projectSweaveOptionsMenuLabel();
    @DefaultStringValue("@d")
    String projectSweaveOptionsDesc();
    
    // showToolbar
    @DefaultStringValue("@dShow _Toolbar")
    String showToolbarMenuLabel();
    
    // hideToolbar
    @DefaultStringValue("@dHide _Toolbar")
    String hideToolbarMenuLabel();
    
    // toggleToolbar
    @DefaultStringValue("@dToggle Visibility of Toolbar")
    String toggleToolbarLabel();
    @DefaultStringValue("@dToggle Toolbar")
    String toggleToolbarMenuLabel();
    
    // zoomActualSize
    @DefaultStringValue("@dActual _Size")
    String zoomActualSizeMenuLabel();
    
    // zoomIn
    @DefaultStringValue("@d_Zoom In")
    String zoomInMenuLabel();
    
    // zoomOut
    @DefaultStringValue("@dZoom O_ut")
    String zoomOutMenuLabel();
    
    // goToFileFunction
    @DefaultStringValue("@dGo To File/Function...")
    String goToFileFunctionLabel();
    @DefaultStringValue("@dGo To File/F_unction...")
    String goToFileFunctionMenuLabel();
    
    // switchFocusSourceConsole
    @DefaultStringValue("@dSwitch Focus between Source/Console")
    String switchFocusSourceConsoleLabel();
    
    // activateSource
    @DefaultStringValue("@dMove Focus to Source")
    String activateSourceLabel();
    @DefaultStringValue("@dMove Focus to Sou_rce")
    String activateSourceMenuLabel();
    
    // activateConsolePane
    @DefaultStringValue("@dMove Focus to Console Panel")
    String activateConsolePaneLabel();
    @DefaultStringValue("@dMove Focus to _Console Panel")
    String activateConsolePaneMenuLabel();
    
    // activateConsole
    @DefaultStringValue("@dMove Focus to Console")
    String activateConsoleLabel();
    @DefaultStringValue("@dMove Focus to _Console")
    String activateConsoleMenuLabel();
    
    // activateEnvironment
    @DefaultStringValue("@dShow Environment Pane")
    String activateEnvironmentLabel();
    @DefaultStringValue("@dShow _Environment")
    String activateEnvironmentMenuLabel();
    
    // activateData
    @DefaultStringValue("@dShow Data Pane")
    String activateDataLabel();
    @DefaultStringValue("@dShow _Data")
    String activateDataMenuLabel();
    
    // activateHistory
    @DefaultStringValue("@dShow History Pane")
    String activateHistoryLabel();
    @DefaultStringValue("@dShow Histor_y")
    String activateHistoryMenuLabel();
    
    // activateFiles
    @DefaultStringValue("@dShow Files Pane")
    String activateFilesLabel();
    @DefaultStringValue("@dShow F_iles")
    String activateFilesMenuLabel();
    
    // activatePlots
    @DefaultStringValue("@dShow Plots Pane")
    String activatePlotsLabel();
    @DefaultStringValue("@dShow Pl_ots")
    String activatePlotsMenuLabel();
    
    // activatePackages
    @DefaultStringValue("@dShow Packages Pane")
    String activatePackagesLabel();
    @DefaultStringValue("@dShow Pac_kages")
    String activatePackagesMenuLabel();
    
    // activateHelp
    @DefaultStringValue("@dShow Help Pane")
    String activateHelpLabel();
    @DefaultStringValue("@dMove Focus to _Help")
    String activateHelpMenuLabel();
    
    // activateVcs
    @DefaultStringValue("@dShow VCS Pane")
    String activateVcsLabel();
    @DefaultStringValue("@dShow _Vcs")
    String activateVcsMenuLabel();
    
    // activateBuild
    @DefaultStringValue("@dShow Build Pane")
    String activateBuildLabel();
    @DefaultStringValue("@dShow _Build")
    String activateBuildMenuLabel();
    
    // activateViewer
    @DefaultStringValue("@dShow Viewer Pane")
    String activateViewerLabel();
    @DefaultStringValue("@dShow Vie_wer")
    String activateViewerMenuLabel();
    
    // activatePresentation
    @DefaultStringValue("@dShow Presentation Pane")
    String activatePresentationLabel();
    @DefaultStringValue("@dShow Prese_ntation")
    String activatePresentationMenuLabel();
    
    // activateConnections
    @DefaultStringValue("@dShow Connections Pane")
    String activateConnectionsLabel();
    @DefaultStringValue("@dShow Co_nnections")
    String activateConnectionsMenuLabel();
    
    // activateTutorial
    @DefaultStringValue("@dShow Tutorial Pane")
    String activateTutorialLabel();
    @DefaultStringValue("@dShow _Tutorial")
    String activateTutorialMenuLabel();
    
    // activateJobs
    @DefaultStringValue("@dShow Jobs Pane")
    String activateJobsLabel();
    @DefaultStringValue("@dShow _Jobs")
    String activateJobsMenuLabel();
    
    // activateLauncherJobs
    @DefaultStringValue("@dShow Launcher Pane")
    String activateLauncherJobsLabel();
    @DefaultStringValue("@dShow _Launcher")
    String activateLauncherJobsMenuLabel();
    
    // activateCompilePDF
    @DefaultStringValue("@dShow Compile PDF Pane")
    String activateCompilePDFLabel();
    @DefaultStringValue("@dShow Compile _PDF")
    String activateCompilePDFMenuLabel();
    
    // activateFindInFiles
    @DefaultStringValue("@dShow Find in Files")
    String activateFindInFilesLabel();
    @DefaultStringValue("@dShow _Find in Files")
    String activateFindInFilesMenuLabel();
    
    // activateSourceCpp
    @DefaultStringValue("@dShow Source Cpp Pane")
    String activateSourceCppLabel();
    @DefaultStringValue("@dShow Sou_rce Cpp")
    String activateSourceCppMenuLabel();
    
    // activateRMarkdown
    @DefaultStringValue("@dShow R Markdown Pane")
    String activateRMarkdownLabel();
    @DefaultStringValue("@dShow _R Markdown")
    String activateRMarkdownMenuLabel();
    
    // activateDeployContent
    @DefaultStringValue("@dShow Deploy Content Pane")
    String activateDeployContentLabel();
    @DefaultStringValue("@dShow Deploy _Content")
    String activateDeployContentMenuLabel();
    
    // activateMarkers
    @DefaultStringValue("@dShow Markers Pane")
    String activateMarkersLabel();
    @DefaultStringValue("@dShow _Markers")
    String activateMarkersMenuLabel();
    
    // activateSQLResults
    @DefaultStringValue("@dShow SQL Results Pane")
    String activateSQLResultsLabel();
    @DefaultStringValue("@dShow S_QL Results")
    String activateSQLResultsMenuLabel();
    
    // layoutZoomSource
    @DefaultStringValue("@dZoom Source")
    String layoutZoomSourceLabel();
    @DefaultStringValue("@dZoom Sou_rce")
    String layoutZoomSourceMenuLabel();
    
    // layoutZoomConsolePane
    @DefaultStringValue("@dZoom Console Pane")
    String layoutZoomConsolePaneLabel();
    @DefaultStringValue("@dZoom Console Pane")
    String layoutZoomConsolePaneMenuLabel();
    
    // layoutZoomConsole
    @DefaultStringValue("@dZoom Console")
    String layoutZoomConsoleLabel();
    @DefaultStringValue("@dZoom _Console")
    String layoutZoomConsoleMenuLabel();
    
    // layoutZoomEnvironment
    @DefaultStringValue("@dZoom Environment")
    String layoutZoomEnvironmentLabel();
    @DefaultStringValue("@dZoom _Environment")
    String layoutZoomEnvironmentMenuLabel();
    
    // layoutZoomHistory
    @DefaultStringValue("@dZoom History")
    String layoutZoomHistoryLabel();
    @DefaultStringValue("@dZoom Histor_y")
    String layoutZoomHistoryMenuLabel();
    
    // layoutZoomFiles
    @DefaultStringValue("@dZoom Files")
    String layoutZoomFilesLabel();
    @DefaultStringValue("@dZoom F_iles")
    String layoutZoomFilesMenuLabel();
    
    // layoutZoomPlots
    @DefaultStringValue("@dZoom Plots")
    String layoutZoomPlotsLabel();
    @DefaultStringValue("@dZoom Pl_ots")
    String layoutZoomPlotsMenuLabel();
    
    // layoutZoomPackages
    @DefaultStringValue("@dZoom Packages")
    String layoutZoomPackagesLabel();
    @DefaultStringValue("@dZoom P_ackages")
    String layoutZoomPackagesMenuLabel();
    
    // layoutZoomHelp
    @DefaultStringValue("@dZoom Help")
    String layoutZoomHelpLabel();
    @DefaultStringValue("@dZoom _Help")
    String layoutZoomHelpMenuLabel();
    
    // layoutZoomVcs
    @DefaultStringValue("@dZoom VCS")
    String layoutZoomVcsLabel();
    @DefaultStringValue("@dZoom _VCS")
    String layoutZoomVcsMenuLabel();
    
    // layoutZoomTutorial
    @DefaultStringValue("@dZoom Tutorial")
    String layoutZoomTutorialLabel();
    @DefaultStringValue("@dZoom _Tutorial")
    String layoutZoomTutorialMenuLabel();
    
    // layoutZoomBuild
    @DefaultStringValue("@dZoom Build")
    String layoutZoomBuildLabel();
    @DefaultStringValue("@dZoom _Build")
    String layoutZoomBuildMenuLabel();
    
    // layoutZoomViewer
    @DefaultStringValue("@dZoom Viewer")
    String layoutZoomViewerLabel();
    @DefaultStringValue("@dZoom Vie_wer")
    String layoutZoomViewerMenuLabel();
    
    // layoutZoomConnections
    @DefaultStringValue("@dZoom Connections")
    String layoutZoomConnectionsLabel();
    @DefaultStringValue("@dZoom Co_nnections")
    String layoutZoomConnectionsMenuLabel();
    
    // layoutZoomCurrentPane
    @DefaultStringValue("@dToggle Zoom for Current Pane")
    String layoutZoomCurrentPaneLabel();
    
    // layoutEndZoom
    @DefaultStringValue("@dShow All Panes")
    String layoutEndZoomLabel();
    @DefaultStringValue("@d_Show All Panes")
    String layoutEndZoomMenuLabel();
    
    // newSourceColumn
    @DefaultStringValue("@dAdd Source Column")
    String newSourceColumnLabel();
    @DefaultStringValue("@d_Add Source Column")
    String newSourceColumnMenuLabel();
    
    // layoutConsoleOnLeft
    @DefaultStringValue("@dConsole on Left")
    String layoutConsoleOnLeftLabel();
    @DefaultStringValue("@dConsole on _Left")
    String layoutConsoleOnLeftMenuLabel();
    
    // layoutConsoleOnRight
    @DefaultStringValue("@dConsole on Right")
    String layoutConsoleOnRightLabel();
    @DefaultStringValue("@dConsole on _Right")
    String layoutConsoleOnRightMenuLabel();
    
    // layoutZoomLeftColumn
    @DefaultStringValue("@dZoom Left / Center Column")
    String layoutZoomLeftColumnLabel();
    @DefaultStringValue("@d_Zoom Left / Center Column")
    String layoutZoomLeftColumnMenuLabel();
    
    // layoutZoomRightColumn
    @DefaultStringValue("@dZoom Right Column")
    String layoutZoomRightColumnLabel();
    @DefaultStringValue("@dZoo_m Right Column")
    String layoutZoomRightColumnMenuLabel();
    
    // jumpTo
    @DefaultStringValue("@dJump To...")
    String jumpToLabel();
    @DefaultStringValue("@d_Jump To...")
    String jumpToMenuLabel();
    
    // switchToTab
    @DefaultStringValue("@dSwitch to Tab...")
    String switchToTabLabel();
    @DefaultStringValue("@dSwitch to Ta_b...")
    String switchToTabMenuLabel();
    
    // previousTab
    @DefaultStringValue("@dOpen Previous Tab")
    String previousTabLabel();
    @DefaultStringValue("@d_Previous Tab")
    String previousTabMenuLabel();
    
    // nextTab
    @DefaultStringValue("@dOpen Next Tab")
    String nextTabLabel();
    @DefaultStringValue("@d_Next Tab")
    String nextTabMenuLabel();
    
    // firstTab
    @DefaultStringValue("@dOpen First Tab")
    String firstTabLabel();
    @DefaultStringValue("@d_First Tab")
    String firstTabMenuLabel();
    
    // lastTab
    @DefaultStringValue("@dOpen Last Tab")
    String lastTabLabel();
    @DefaultStringValue("@d_Last Tab")
    String lastTabMenuLabel();
    
    // moveTabLeft
    @DefaultStringValue("@dMove Tab Left")
    String moveTabLeftLabel();
    @DefaultStringValue("@dMove Tab Lef_t")
    String moveTabLeftMenuLabel();
    
    // moveTabRight
    @DefaultStringValue("@dMove Tab Right")
    String moveTabRightLabel();
    @DefaultStringValue("@dMove Tab _Right")
    String moveTabRightMenuLabel();
    
    // moveTabToFirst
    @DefaultStringValue("@dMove Tab to First")
    String moveTabToFirstLabel();
    @DefaultStringValue("@dMove Tab to _First")
    String moveTabToFirstMenuLabel();
    
    // moveTabToLast
    @DefaultStringValue("@dMove Tab to Last")
    String moveTabToLastLabel();
    @DefaultStringValue("@dMove Tab to La_st")
    String moveTabToLastMenuLabel();
    
    // goToLine
    @DefaultStringValue("@dGo to Line...")
    String goToLineLabel();
    @DefaultStringValue("@d_Go to Line...")
    String goToLineMenuLabel();
    
    // toggleFullScreen
    @DefaultStringValue("@dToggle _Full Screen")
    String toggleFullScreenMenuLabel();
    
    // findFromSelection
    @DefaultStringValue("@d_Use Selection for Find")
    String findFromSelectionMenuLabel();
    
    // quickAddNext
    @DefaultStringValue("@dFind and Add Next")
    String quickAddNextLabel();
    @DefaultStringValue("@dAdd")
    String quickAddNextButtonLabel();
    @DefaultStringValue("@dFind and Add Next")
    String quickAddNextMenuLabel();
    @DefaultStringValue("@dFind and add next occurence")
    String quickAddNextDesc();
    
    // findAll
    @DefaultStringValue("@dFind All")
    String findAllLabel();
    
    // findReplace
    @DefaultStringValue("@dFind / Replace Text...")
    String findReplaceLabel();
    @DefaultStringValue("@d_Find...")
    String findReplaceMenuLabel();
    
    // findNext
    @DefaultStringValue("@dFind Next Occurence")
    String findNextLabel();
    @DefaultStringValue("@dNext")
    String findNextButtonLabel();
    @DefaultStringValue("@dFind _Next")
    String findNextMenuLabel();
    @DefaultStringValue("@dFind next occurrence")
    String findNextDesc();
    
    // findPrevious
    @DefaultStringValue("@dFind Previous Occurence")
    String findPreviousLabel();
    @DefaultStringValue("@dPrev")
    String findPreviousButtonLabel();
    @DefaultStringValue("@dFind Pre_vious")
    String findPreviousMenuLabel();
    @DefaultStringValue("@dFind previous occurrence")
    String findPreviousDesc();
    
    // findSelectAll
    @DefaultStringValue("@dFind and Select All")
    String findSelectAllLabel();
    @DefaultStringValue("@dAll")
    String findSelectAllButtonLabel();
    @DefaultStringValue("@dFind And Select All")
    String findSelectAllMenuLabel();
    @DefaultStringValue("@dFind and select all matches")
    String findSelectAllDesc();
    
    // replaceAndFind
    @DefaultStringValue("@dReplace and Find Next")
    String replaceAndFindLabel();
    @DefaultStringValue("@dReplace")
    String replaceAndFindButtonLabel();
    @DefaultStringValue("@d_Replace and Find")
    String replaceAndFindMenuLabel();
    @DefaultStringValue("@dReplace and find next occurrence")
    String replaceAndFindDesc();
    
    // findInFiles
    @DefaultStringValue("@dFind _in Files...")
    String findInFilesMenuLabel();
    
    // fold
    @DefaultStringValue("@dCollapse Fold")
    String foldLabel();
    @DefaultStringValue("@d_Collapse")
    String foldMenuLabel();
    
    // unfold
    @DefaultStringValue("@dExpand Fold")
    String unfoldLabel();
    @DefaultStringValue("@dE_xpand")
    String unfoldMenuLabel();
    
    // foldAll
    @DefaultStringValue("@dCollapse All Folds")
    String foldAllLabel();
    @DefaultStringValue("@dCollapse _All")
    String foldAllMenuLabel();
    
    // unfoldAll
    @DefaultStringValue("@dExpand All Folds")
    String unfoldAllLabel();
    @DefaultStringValue("@dEx_pand All")
    String unfoldAllMenuLabel();
    
    // jumpToMatching
    @DefaultStringValue("@dJump to Matching Bracket")
    String jumpToMatchingLabel();
    @DefaultStringValue("@dJump To _Matching")
    String jumpToMatchingMenuLabel();
    @DefaultStringValue("@dJump to matching bracket")
    String jumpToMatchingDesc();
    
    // expandToMatching
    @DefaultStringValue("@dExpand to Matching Bracket")
    String expandToMatchingLabel();
    @DefaultStringValue("@dExpand To _Matching")
    String expandToMatchingMenuLabel();
    @DefaultStringValue("@dExpand selection to matching bracket")
    String expandToMatchingDesc();
    
    // addCursorAbove
    @DefaultStringValue("@dAdd Cursor Above Current Cursor")
    String addCursorAboveMenuLabel();
    
    // addCursorBelow
    @DefaultStringValue("@dAdd Cursor Below Current Cursor")
    String addCursorBelowMenuLabel();
    
    // moveLinesUp
    @DefaultStringValue("@dMove Lines Up")
    String moveLinesUpMenuLabel();
    
    // moveLinesDown
    @DefaultStringValue("@dMove Lines Down")
    String moveLinesDownMenuLabel();
    
    // expandToLine
    @DefaultStringValue("@dExpand Selection to Line")
    String expandToLineMenuLabel();
    
    // copyLinesDown
    @DefaultStringValue("@dCopy Lines Down")
    String copyLinesDownMenuLabel();
    
    // joinLines
    @DefaultStringValue("@dJoin Lines")
    String joinLinesMenuLabel();
    
    // removeLine
    @DefaultStringValue("@dRemove Line")
    String removeLineMenuLabel();
    
    // splitIntoLines
    @DefaultStringValue("@dSplit Into Lines")
    String splitIntoLinesMenuLabel();
    @DefaultStringValue("@dCreate a new cursor on each line in current selection")
    String splitIntoLinesDesc();
    
    // editLinesFromStart
    @DefaultStringValue("@dEdit Lines from Start")
    String editLinesFromStartMenuLabel();
    @DefaultStringValue("@dCreate a new cursor at start of each line in selection")
    String editLinesFromStartDesc();
    
    // executeAllCode
    @DefaultStringValue("@dRun All Code in Current Source File")
    String executeAllCodeLabel();
    @DefaultStringValue("@d")
    String executeAllCodeButtonLabel();
    @DefaultStringValue("@dRun _All")
    String executeAllCodeMenuLabel();
    @DefaultStringValue("@dRun all of the code in the source file")
    String executeAllCodeDesc();
    
    // executeCode
    @DefaultStringValue("@dRun Current Line or Selection")
    String executeCodeLabel();
    @DefaultStringValue("@dRun")
    String executeCodeButtonLabel();
    @DefaultStringValue("@dRun Selected _Line(s)")
    String executeCodeMenuLabel();
    @DefaultStringValue("@dRun the current line or selection")
    String executeCodeDesc();
    
    // executeCodeWithoutMovingCursor
    @DefaultStringValue("@dRun Current Line or Selection (Without Moving Cursor)")
    String executeCodeWithoutMovingCursorLabel();
    @DefaultStringValue("@dRun")
    String executeCodeWithoutMovingCursorButtonLabel();
    @DefaultStringValue("@dRun _Line(s) without moving cursor")
    String executeCodeWithoutMovingCursorMenuLabel();
    @DefaultStringValue("@dRun the current line or selection without moving the cursor")
    String executeCodeWithoutMovingCursorDesc();
    
    // executeCodeWithoutFocus
    
    // executeToCurrentLine
    @DefaultStringValue("@dExecute Code up to Current Line")
    String executeToCurrentLineLabel();
    @DefaultStringValue("@dRun From _Beginning To Line")
    String executeToCurrentLineMenuLabel();
    @DefaultStringValue("@dRun from the beginning of the source file up through the current line")
    String executeToCurrentLineDesc();
    
    // executeFromCurrentLine
    @DefaultStringValue("@dExecute Code From Current Line to End of Document")
    String executeFromCurrentLineLabel();
    @DefaultStringValue("@dRun From Line to _End")
    String executeFromCurrentLineMenuLabel();
    @DefaultStringValue("@dRun from the current line through the end of the source file")
    String executeFromCurrentLineDesc();
    
    // executeCurrentFunction
    @DefaultStringValue("@dRun Current Function Definition")
    String executeCurrentFunctionLabel();
    @DefaultStringValue("@dRun _Function Definition")
    String executeCurrentFunctionMenuLabel();
    @DefaultStringValue("@dRun the top-level function definition, if any, that contains the cursor")
    String executeCurrentFunctionDesc();
    
    // executeCurrentSection
    @DefaultStringValue("@dExecute Current Code Section")
    String executeCurrentSectionLabel();
    @DefaultStringValue("@dRun Section")
    String executeCurrentSectionButtonLabel();
    @DefaultStringValue("@dRun Code _Section")
    String executeCurrentSectionMenuLabel();
    @DefaultStringValue("@dRun the code section that contains the cursor")
    String executeCurrentSectionDesc();
    
    // executeLastCode
    @DefaultStringValue("@dRe-Run Previous Code Execution")
    String executeLastCodeLabel();
    @DefaultStringValue("@d")
    String executeLastCodeButtonLabel();
    @DefaultStringValue("@dRe-Run _Previous")
    String executeLastCodeMenuLabel();
    @DefaultStringValue("@dRe-run the previous code region")
    String executeLastCodeDesc();
    
    // executeCurrentLine
    @DefaultStringValue("@dExecute Current Line")
    String executeCurrentLineLabel();
    @DefaultStringValue("@dExecute Current _Line")
    String executeCurrentLineMenuLabel();
    @DefaultStringValue("@dExecute the line which contains the cursor")
    String executeCurrentLineDesc();
    
    // executeCurrentStatement
    @DefaultStringValue("@dExecute Current Statement")
    String executeCurrentStatementLabel();
    @DefaultStringValue("@dExecute Current _Statement")
    String executeCurrentStatementMenuLabel();
    @DefaultStringValue("@dExecute the entire R statement which contains the cursor.")
    String executeCurrentStatementDesc();
    
    // executeCurrentParagraph
    @DefaultStringValue("@dExecute Current Paragraph")
    String executeCurrentParagraphLabel();
    @DefaultStringValue("@dExecute Current _Paragraph")
    String executeCurrentParagraphMenuLabel();
    @DefaultStringValue("@dExecute the current paragraph of code, delimited by blank lines.")
    String executeCurrentParagraphDesc();
    
    // insertChunk
    @DefaultStringValue("@d_Insert Chunk")
    String insertChunkMenuLabel();
    @DefaultStringValue("@dInsert a new code chunk")
    String insertChunkDesc();
    
    // insertChunkR
    @DefaultStringValue("@dR")
    String insertChunkRMenuLabel();
    @DefaultStringValue("@dInsert a new R chunk")
    String insertChunkRDesc();
    
    // insertChunkBash
    @DefaultStringValue("@dBash")
    String insertChunkBashMenuLabel();
    @DefaultStringValue("@dInsert a new Bash chunk")
    String insertChunkBashDesc();
    
    // insertChunkD3
    @DefaultStringValue("@dD3")
    String insertChunkD3MenuLabel();
    @DefaultStringValue("@dInsert a new D3 chunk")
    String insertChunkD3Desc();
    
    // insertChunkPython
    @DefaultStringValue("@dPython")
    String insertChunkPythonMenuLabel();
    @DefaultStringValue("@dInsert a new Python chunk")
    String insertChunkPythonDesc();
    
    // insertChunkRCPP
    @DefaultStringValue("@dRcpp")
    String insertChunkRCPPMenuLabel();
    @DefaultStringValue("@dInsert a new Rcpp chunk")
    String insertChunkRCPPDesc();
    
    // insertChunkStan
    @DefaultStringValue("@dStan")
    String insertChunkStanMenuLabel();
    @DefaultStringValue("@dInsert a new Stan chunk")
    String insertChunkStanDesc();
    
    // insertChunkSQL
    @DefaultStringValue("@dSQL")
    String insertChunkSQLMenuLabel();
    @DefaultStringValue("@dInsert a new SQL chunk")
    String insertChunkSQLDesc();
    
    // switchToChunkR
    @DefaultStringValue("@dR")
    String switchToChunkRMenuLabel();
    @DefaultStringValue("@dSwitch chunk to R")
    String switchToChunkRDesc();
    
    // switchToChunkBash
    @DefaultStringValue("@dBash")
    String switchToChunkBashMenuLabel();
    @DefaultStringValue("@dSwitch chunk to Bash")
    String switchToChunkBashDesc();
    
    // switchToChunkPython
    @DefaultStringValue("@dPython")
    String switchToChunkPythonMenuLabel();
    @DefaultStringValue("@dSwitch chunk to Python")
    String switchToChunkPythonDesc();
    
    // switchToChunkRCPP
    @DefaultStringValue("@dRcpp")
    String switchToChunkRCPPMenuLabel();
    @DefaultStringValue("@dSwitch chunk to Rcpp")
    String switchToChunkRCPPDesc();
    
    // switchToChunkStan
    @DefaultStringValue("@dStan")
    String switchToChunkStanMenuLabel();
    @DefaultStringValue("@dSwitch chunk to Stan")
    String switchToChunkStanDesc();
    
    // switchToChunkSQL
    @DefaultStringValue("@dSQL")
    String switchToChunkSQLMenuLabel();
    @DefaultStringValue("@dSwitch chunk to SQL")
    String switchToChunkSQLDesc();
    
    // insertSection
    @DefaultStringValue("@d_Insert Section...")
    String insertSectionMenuLabel();
    @DefaultStringValue("@dInsert a new code section")
    String insertSectionDesc();
    
    // executePreviousChunks
    @DefaultStringValue("@d_Run All Chunks Above")
    String executePreviousChunksMenuLabel();
    @DefaultStringValue("@dRun all chunks above the current one")
    String executePreviousChunksDesc();
    
    // executeSubsequentChunks
    @DefaultStringValue("@dRun All C_hunks Below")
    String executeSubsequentChunksMenuLabel();
    @DefaultStringValue("@dRun all chunks below the current one")
    String executeSubsequentChunksDesc();
    
    // executeCurrentChunk
    @DefaultStringValue("@dRun _Current Chunk")
    String executeCurrentChunkMenuLabel();
    @DefaultStringValue("@dRun the current code chunk")
    String executeCurrentChunkDesc();
    
    // executeNextChunk
    @DefaultStringValue("@dRun _Next Chunk")
    String executeNextChunkMenuLabel();
    @DefaultStringValue("@dRun the next code chunk")
    String executeNextChunkDesc();
    
    // executeSetupChunk
    @DefaultStringValue("@dRun _Setup Chunk")
    String executeSetupChunkMenuLabel();
    @DefaultStringValue("@dRun the initial setup chunk")
    String executeSetupChunkDesc();
    
    // goToHelp
    @DefaultStringValue("@dShow Help for Current Function")
    String goToHelpLabel();
    @DefaultStringValue("@dGo To _Help")
    String goToHelpMenuLabel();
    @DefaultStringValue("@dGo to help for the currently selected function")
    String goToHelpDesc();
    
    // goToDefinition
    @DefaultStringValue("@d_Go To Function Definition")
    String goToDefinitionMenuLabel();
    @DefaultStringValue("@dGo to to the definition of the currently selected function")
    String goToDefinitionDesc();
    
    // codeCompletion
    @DefaultStringValue("@dRetrieve Completions")
    String codeCompletionLabel();
    @DefaultStringValue("@dCode Completion")
    String codeCompletionMenuLabel();
    @DefaultStringValue("@dShow code completions at the current cursor location")
    String codeCompletionDesc();
    
    // sourceNavigateBack
    @DefaultStringValue("@dBac_k")
    String sourceNavigateBackMenuLabel();
    @DefaultStringValue("@dGo back to the previous source location")
    String sourceNavigateBackDesc();
    
    // sourceNavigateForward
    @DefaultStringValue("@dFor_ward")
    String sourceNavigateForwardMenuLabel();
    @DefaultStringValue("@dGo forward to the next source location")
    String sourceNavigateForwardDesc();
    
    // extractFunction
    @DefaultStringValue("@dE_xtract Function")
    String extractFunctionMenuLabel();
    @DefaultStringValue("@dTurn the current selection into a function")
    String extractFunctionDesc();
    
    // extractLocalVariable
    @DefaultStringValue("@dExtract _Variable")
    String extractLocalVariableMenuLabel();
    @DefaultStringValue("@dExtract a variable out of the current selection")
    String extractLocalVariableDesc();
    
    // findUsages
    @DefaultStringValue("@dFind _Usages")
    String findUsagesMenuLabel();
    @DefaultStringValue("@dFind source locations where this symbol is used")
    String findUsagesDesc();
    
    // sourceFile
    @DefaultStringValue("@d")
    String sourceFileButtonLabel();
    @DefaultStringValue("@dSource _File...")
    String sourceFileMenuLabel();
    @DefaultStringValue("@dSource the contents of an R file")
    String sourceFileDesc();
    
    // previewJS
    @DefaultStringValue("@dPreview")
    String previewJSButtonLabel();
    @DefaultStringValue("@dPreview J_S")
    String previewJSMenuLabel();
    @DefaultStringValue("@dPreview the active JavaScript document")
    String previewJSDesc();
    
    // previewSql
    @DefaultStringValue("@dPreview")
    String previewSqlButtonLabel();
    @DefaultStringValue("@dPreview S_QL")
    String previewSqlMenuLabel();
    @DefaultStringValue("@dPreview the active SQL document")
    String previewSqlDesc();
    
    // sourceActiveDocument
    @DefaultStringValue("@dSource")
    String sourceActiveDocumentButtonLabel();
    @DefaultStringValue("@d_Source")
    String sourceActiveDocumentMenuLabel();
    @DefaultStringValue("@dSource the contents of the active document")
    String sourceActiveDocumentDesc();
    
    // sourceActiveDocumentWithEcho
    @DefaultStringValue("@d")
    String sourceActiveDocumentWithEchoButtonLabel();
    @DefaultStringValue("@dSource with _Echo")
    String sourceActiveDocumentWithEchoMenuLabel();
    @DefaultStringValue("@dSource the contents of the active document (with echo)")
    String sourceActiveDocumentWithEchoDesc();
    
    // commentUncomment
    @DefaultStringValue("@dComment / Uncomment Selection")
    String commentUncommentLabel();
    @DefaultStringValue("@d_Comment/Uncomment Lines")
    String commentUncommentMenuLabel();
    @DefaultStringValue("@dComment or uncomment the current line/selection")
    String commentUncommentDesc();
    
    // reformatCode
    @DefaultStringValue("@dReformat Current Selection")
    String reformatCodeLabel();
    @DefaultStringValue("@dRe_format Code")
    String reformatCodeMenuLabel();
    @DefaultStringValue("@dReformat the current line/selection")
    String reformatCodeDesc();
    
    // showDiagnosticsActiveDocument
    @DefaultStringValue("@dShow Diagnostics for Current Document")
    String showDiagnosticsActiveDocumentLabel();
    @DefaultStringValue("@dShow _Diagnostics")
    String showDiagnosticsActiveDocumentMenuLabel();
    @DefaultStringValue("@dShow diagnostics for the active document")
    String showDiagnosticsActiveDocumentDesc();
    
    // showDiagnosticsProject
    @DefaultStringValue("@dShow Diagnostics for Current Project")
    String showDiagnosticsProjectLabel();
    @DefaultStringValue("@dShow Diagnostics (Projec_t)")
    String showDiagnosticsProjectMenuLabel();
    @DefaultStringValue("@dShow diagnostics for all source files in the current project")
    String showDiagnosticsProjectDesc();
    
    // reindent
    @DefaultStringValue("@dReindent Selection")
    String reindentLabel();
    @DefaultStringValue("@d_Reindent Lines")
    String reindentMenuLabel();
    @DefaultStringValue("@dReindent the current line/selection")
    String reindentDesc();
    
    // reflowComment
    @DefaultStringValue("@dReflow Co_mment")
    String reflowCommentMenuLabel();
    @DefaultStringValue("@dReflow selected comment lines so they wrap evenly")
    String reflowCommentDesc();
    
    // renameInScope
    @DefaultStringValue("@dRename Symbol in Scope")
    String renameInScopeLabel();
    @DefaultStringValue("@dRen_ame in Scope")
    String renameInScopeMenuLabel();
    @DefaultStringValue("@dRename symbol in current scope")
    String renameInScopeDesc();
    
    // insertSnippet
    @DefaultStringValue("@dInsert Snippet")
    String insertSnippetMenuLabel();
    @DefaultStringValue("@dExpand snippet at cursor")
    String insertSnippetDesc();
    
    // insertRoxygenSkeleton
    @DefaultStringValue("@dInsert Ro_xygen Skeleton")
    String insertRoxygenSkeletonMenuLabel();
    @DefaultStringValue("@dInsert a roxygen comment for the current function")
    String insertRoxygenSkeletonDesc();
    
    // expandSelection
    @DefaultStringValue("@dExpand Selection")
    String expandSelectionMenuLabel();
    @DefaultStringValue("@dExpand selection")
    String expandSelectionDesc();
    
    // shrinkSelection
    @DefaultStringValue("@dShrink Selection")
    String shrinkSelectionMenuLabel();
    @DefaultStringValue("@dShrink selection")
    String shrinkSelectionDesc();
    
    // goToNextSection
    @DefaultStringValue("@dGo to Next Section")
    String goToNextSectionLabel();
    @DefaultStringValue("@d")
    String goToNextSectionButtonLabel();
    @DefaultStringValue("@dGo to next section/chunk")
    String goToNextSectionDesc();
    
    // goToPrevSection
    @DefaultStringValue("@dGo to Previous Section")
    String goToPrevSectionLabel();
    @DefaultStringValue("@d")
    String goToPrevSectionButtonLabel();
    @DefaultStringValue("@dGo to previous section/chunk")
    String goToPrevSectionDesc();
    
    // goToStartOfCurrentScope
    
    // goToEndOfCurrentScope
    
    // goToNextChunk
    @DefaultStringValue("@dGo to Next Chunk")
    String goToNextChunkLabel();
    @DefaultStringValue("@dGo to next chunk")
    String goToNextChunkDesc();
    
    // goToPrevChunk
    @DefaultStringValue("@dGo to Previous Chunk")
    String goToPrevChunkLabel();
    @DefaultStringValue("@dGo to previous chunk")
    String goToPrevChunkDesc();
    
    // expandRaggedSelection
    @DefaultStringValue("@dExpand Ragged Selection")
    String expandRaggedSelectionLabel();
    
    // markdownHelp
    @DefaultStringValue("@dOpen Markdown Quick Reference")
    String markdownHelpLabel();
    @DefaultStringValue("@d_Markdown Quick Reference")
    String markdownHelpMenuLabel();
    @DefaultStringValue("@dMarkdown quick reference")
    String markdownHelpDesc();
    
    // openRoxygenQuickReference
    @DefaultStringValue("@d_Roxygen Quick Reference")
    String openRoxygenQuickReferenceMenuLabel();
    @DefaultStringValue("@dRoxygen quick reference")
    String openRoxygenQuickReferenceDesc();
    
    // toggleDocumentOutline
    @DefaultStringValue("@dToggle Document Outline")
    String toggleDocumentOutlineLabel();
    @DefaultStringValue("@d_Show Document Outline")
    String toggleDocumentOutlineMenuLabel();
    @DefaultStringValue("@dShow document outline")
    String toggleDocumentOutlineDesc();
    
    // toggleRmdVisualMode
    @DefaultStringValue("@dToggle Visual Markdown Editor")
    String toggleRmdVisualModeLabel();
    @DefaultStringValue("@d_Use Visual Editor")
    String toggleRmdVisualModeMenuLabel();
    @DefaultStringValue("@dToggle visual markdown editor")
    String toggleRmdVisualModeDesc();
    
    // enableProsemirrorDevTools
    @DefaultStringValue("@dEnable Prosemirror DevTools")
    String enableProsemirrorDevToolsLabel();
    @DefaultStringValue("@d_Prosemirror DevTools")
    String enableProsemirrorDevToolsMenuLabel();
    @DefaultStringValue("@dEnable Prosemirror DevTools")
    String enableProsemirrorDevToolsDesc();
    
    // usingRMarkdownHelp
    @DefaultStringValue("@d_Using R Markdown")
    String usingRMarkdownHelpMenuLabel();
    @DefaultStringValue("@dGuide to using R Markdown")
    String usingRMarkdownHelpDesc();
    
    // authoringRPresentationsHelp
    @DefaultStringValue("@d_Authoring R Presentations")
    String authoringRPresentationsHelpMenuLabel();
    @DefaultStringValue("@dGuide to using R Markdown")
    String authoringRPresentationsHelpDesc();
    
    // openRStudioIDECheatSheet
    @DefaultStringValue("@d_RStudio IDE Cheat Sheet")
    String openRStudioIDECheatSheetMenuLabel();
    @DefaultStringValue("@dRStudio IDE cheat sheet")
    String openRStudioIDECheatSheetDesc();
    
    // openDataVisualizationCheatSheet
    @DefaultStringValue("@dData Visualization with _ggplot2")
    String openDataVisualizationCheatSheetMenuLabel();
    @DefaultStringValue("@dData visualization with ggplot2")
    String openDataVisualizationCheatSheetDesc();
    
    // openPurrrCheatSheet
    @DefaultStringValue("@dList manipulation with _purrr")
    String openPurrrCheatSheetMenuLabel();
    @DefaultStringValue("@dList manipulation with purrr")
    String openPurrrCheatSheetDesc();
    
    // openPackageDevelopmentCheatSheet
    @DefaultStringValue("@dPackage De_velopment with devtools")
    String openPackageDevelopmentCheatSheetMenuLabel();
    @DefaultStringValue("@dPackage development with devtools")
    String openPackageDevelopmentCheatSheetDesc();
    
    // openDataImportCheatSheet
    @DefaultStringValue("@d_Import Data with readr")
    String openDataImportCheatSheetMenuLabel();
    @DefaultStringValue("@dImport data with readr")
    String openDataImportCheatSheetDesc();
    
    // openDataWranglingCheatSheet
    @DefaultStringValue("@dData Manipulation with dplyr, tid_yr")
    String openDataWranglingCheatSheetMenuLabel();
    @DefaultStringValue("@dData manipulation with dplyr and tidyr")
    String openDataWranglingCheatSheetDesc();
    
    // openDataTransformationCheatSheet
    @DefaultStringValue("@dData Transformation with _dplyr")
    String openDataTransformationCheatSheetMenuLabel();
    @DefaultStringValue("@dData transformation with dplyr")
    String openDataTransformationCheatSheetDesc();
    
    // openSparklyrCheatSheet
    @DefaultStringValue("@dInterfacing Spar_k with sparklyr")
    String openSparklyrCheatSheetMenuLabel();
    @DefaultStringValue("@dInterfacing Apache Spark with sparklyr")
    String openSparklyrCheatSheetDesc();
    
    // openRMarkdownCheatSheet
    @DefaultStringValue("@dR _Markdown Cheat Sheet")
    String openRMarkdownCheatSheetMenuLabel();
    @DefaultStringValue("@dR Markdown cheat sheet")
    String openRMarkdownCheatSheetDesc();
    
    // openRMarkdownReferenceGuide
    @DefaultStringValue("@dR Markdo_wn Reference Guide")
    String openRMarkdownReferenceGuideMenuLabel();
    @DefaultStringValue("@dR Markdown reference guide")
    String openRMarkdownReferenceGuideDesc();
    
    // openShinyCheatSheet
    @DefaultStringValue("@dWeb Applications with _shiny")
    String openShinyCheatSheetMenuLabel();
    @DefaultStringValue("@dBuild web applications with Shiny")
    String openShinyCheatSheetDesc();
    
    // browseCheatSheets
    @DefaultStringValue("@d_Browse Cheatsheets...")
    String browseCheatSheetsMenuLabel();
    @DefaultStringValue("@dBrowse available cheatsheets in your web browser")
    String browseCheatSheetsDesc();
    
    // knitDocument
    @DefaultStringValue("@dKnit Current Document")
    String knitDocumentLabel();
    @DefaultStringValue("@dKnit")
    String knitDocumentButtonLabel();
    @DefaultStringValue("@d_Knit Document")
    String knitDocumentMenuLabel();
    @DefaultStringValue("@dKnit the current document")
    String knitDocumentDesc();
    
    // previewHTML
    @DefaultStringValue("@dPreview Document as HTML")
    String previewHTMLLabel();
    @DefaultStringValue("@dPreview")
    String previewHTMLButtonLabel();
    @DefaultStringValue("@dPrevie_w")
    String previewHTMLMenuLabel();
    @DefaultStringValue("@dShow a preview of the current document as HTML")
    String previewHTMLDesc();
    
    // publishHTML
    @DefaultStringValue("@dPublish to RPubs...")
    String publishHTMLLabel();
    @DefaultStringValue("@dPublish")
    String publishHTMLButtonLabel();
    @DefaultStringValue("@dP_ublish to RPubs...")
    String publishHTMLMenuLabel();
    @DefaultStringValue("@dPublish the current document")
    String publishHTMLDesc();
    
    // compilePDF
    @DefaultStringValue("@dCompile to PDF...")
    String compilePDFLabel();
    @DefaultStringValue("@dCompile PDF")
    String compilePDFButtonLabel();
    @DefaultStringValue("@d_Compile PDF")
    String compilePDFMenuLabel();
    @DefaultStringValue("@dCompile a PDF from the current LaTeX or Sweave document")
    String compilePDFDesc();
    
    // compileNotebook
    @DefaultStringValue("@d_Compile Report...")
    String compileNotebookMenuLabel();
    @DefaultStringValue("@dCompile a report from the current R script")
    String compileNotebookDesc();
    
    // editRmdFormatOptions
    @DefaultStringValue("@d_Output Options...")
    String editRmdFormatOptionsMenuLabel();
    @DefaultStringValue("@dEdit the R Markdown format options for the current file")
    String editRmdFormatOptionsDesc();
    
    // knitWithParameters
    @DefaultStringValue("@dKnit with Parameters...")
    String knitWithParametersLabel();
    @DefaultStringValue("@dKnit _with Parameters...")
    String knitWithParametersMenuLabel();
    @DefaultStringValue("@dKnit the document with a set of custom parameters")
    String knitWithParametersDesc();
    
    // clearKnitrCache
    @DefaultStringValue("@dClear Knitr Cache...")
    String clearKnitrCacheMenuLabel();
    @DefaultStringValue("@dClear the knitr cache for the current document")
    String clearKnitrCacheDesc();
    
    // clearPrerenderedOutput
    @DefaultStringValue("@dClear Prerendered Output...")
    String clearPrerenderedOutputMenuLabel();
    @DefaultStringValue("@dClear the prerendered output for the current document")
    String clearPrerenderedOutputDesc();
    
    // notebookExpandAllOutput
    @DefaultStringValue("@d")
    String notebookExpandAllOutputButtonLabel();
    @DefaultStringValue("@dE_xpand All Output")
    String notebookExpandAllOutputMenuLabel();
    @DefaultStringValue("@dExpand all code chunk output in the current file")
    String notebookExpandAllOutputDesc();
    
    // notebookToggleExpansion
    @DefaultStringValue("@d")
    String notebookToggleExpansionButtonLabel();
    @DefaultStringValue("@dToggle Chunk Output Expansion")
    String notebookToggleExpansionMenuLabel();
    @DefaultStringValue("@dExpand or collapse the output of the current notebook chunk")
    String notebookToggleExpansionDesc();
    
    // notebookCollapseAllOutput
    @DefaultStringValue("@d")
    String notebookCollapseAllOutputButtonLabel();
    @DefaultStringValue("@dCollapse All _Output")
    String notebookCollapseAllOutputMenuLabel();
    @DefaultStringValue("@dCollapse all code chunk output in the current file")
    String notebookCollapseAllOutputDesc();
    
    // notebookClearOutput
    @DefaultStringValue("@d")
    String notebookClearOutputButtonLabel();
    @DefaultStringValue("@dCl_ear Output")
    String notebookClearOutputMenuLabel();
    @DefaultStringValue("@dClear the output of the current notebook chunk")
    String notebookClearOutputDesc();
    
    // notebookClearAllOutput
    @DefaultStringValue("@d")
    String notebookClearAllOutputButtonLabel();
    @DefaultStringValue("@dClear A_ll Output")
    String notebookClearAllOutputMenuLabel();
    @DefaultStringValue("@dRemove all code chunk output in the current file")
    String notebookClearAllOutputDesc();
    
    // synctexSearch
    @DefaultStringValue("@d")
    String synctexSearchButtonLabel();
    @DefaultStringValue("@dS_ync PDF View to Editor")
    String synctexSearchMenuLabel();
    @DefaultStringValue("@dSync PDF view to editor location (Ctrl+Click)")
    String synctexSearchDesc();
    
    // checkSpelling
    @DefaultStringValue("@dCheck _Spelling...")
    String checkSpellingMenuLabel();
    @DefaultStringValue("@dCheck spelling in document")
    String checkSpellingDesc();
    
    // wordCount
    @DefaultStringValue("@d_Word Count")
    String wordCountMenuLabel();
    @DefaultStringValue("@dCount words in selection or document")
    String wordCountDesc();
    
    // newFolder
    @DefaultStringValue("@dCreate a New Folder...")
    String newFolderLabel();
    @DefaultStringValue("@dNew Folder")
    String newFolderButtonLabel();
    @DefaultStringValue("@dFolder...")
    String newFolderMenuLabel();
    @DefaultStringValue("@dCreate a new folder")
    String newFolderDesc();
    
    // uploadFile
    @DefaultStringValue("@dUpload Files...")
    String uploadFileLabel();
    @DefaultStringValue("@dUpload")
    String uploadFileButtonLabel();
    @DefaultStringValue("@dUpload Files...")
    String uploadFileMenuLabel();
    @DefaultStringValue("@dUpload files to server")
    String uploadFileDesc();
    
    // copyFile
    @DefaultStringValue("@dCopy Files...")
    String copyFileLabel();
    @DefaultStringValue("@dCopy")
    String copyFileButtonLabel();
    @DefaultStringValue("@dCopy...")
    String copyFileMenuLabel();
    @DefaultStringValue("@dCopy selected file or folder")
    String copyFileDesc();
    
    // copyFileTo
    @DefaultStringValue("@dCopy Files To...")
    String copyFileToLabel();
    @DefaultStringValue("@dCopy To")
    String copyFileToButtonLabel();
    @DefaultStringValue("@dCopy To...")
    String copyFileToMenuLabel();
    @DefaultStringValue("@dCopy selected file or folder to another folder")
    String copyFileToDesc();
    
    // moveFiles
    @DefaultStringValue("@dMove Files...")
    String moveFilesLabel();
    @DefaultStringValue("@dMove")
    String moveFilesButtonLabel();
    @DefaultStringValue("@dMove...")
    String moveFilesMenuLabel();
    @DefaultStringValue("@dMove selected files or folders")
    String moveFilesDesc();
    
    // exportFiles
    @DefaultStringValue("@dExport Files...")
    String exportFilesLabel();
    @DefaultStringValue("@dExport")
    String exportFilesButtonLabel();
    @DefaultStringValue("@dExport...")
    String exportFilesMenuLabel();
    @DefaultStringValue("@dExport selected files or folders")
    String exportFilesDesc();
    
    // renameFile
    @DefaultStringValue("@dRename Current File...")
    String renameFileLabel();
    @DefaultStringValue("@dRename")
    String renameFileButtonLabel();
    @DefaultStringValue("@dRename selected file or folder")
    String renameFileDesc();
    
    // deleteFiles
    @DefaultStringValue("@dDelete Files...")
    String deleteFilesLabel();
    @DefaultStringValue("@dDelete")
    String deleteFilesButtonLabel();
    @DefaultStringValue("@dDelete selected files or folders")
    String deleteFilesDesc();
    
    // refreshFiles
    @DefaultStringValue("@dRefresh")
    String refreshFilesMenuLabel();
    @DefaultStringValue("@dRefresh file listing")
    String refreshFilesDesc();
    
    // goToWorkingDir
    @DefaultStringValue("@d")
    String goToWorkingDirButtonLabel();
    @DefaultStringValue("@dGo To Working Directory")
    String goToWorkingDirMenuLabel();
    @DefaultStringValue("@dView the current working directory")
    String goToWorkingDirDesc();
    
    // setAsWorkingDir
    @DefaultStringValue("@dSet As Working Directory")
    String setAsWorkingDirLabel();
    
    // copyFilesPaneCurrentDirectory
    @DefaultStringValue("@dCopy Folder Path to Clipboard")
    String copyFilesPaneCurrentDirectoryLabel();
    
    // showFolder
    @DefaultStringValue("@dShow Folder in New Window")
    String showFolderLabel();
    
    // vcsAddFiles
    @DefaultStringValue("@dAdd Files or Folders")
    String vcsAddFilesLabel();
    @DefaultStringValue("@dAdd")
    String vcsAddFilesButtonLabel();
    @DefaultStringValue("@dAdd")
    String vcsAddFilesMenuLabel();
    @DefaultStringValue("@dAdd the selected files or folders")
    String vcsAddFilesDesc();
    
    // vcsRemoveFiles
    @DefaultStringValue("@dRemove Files or Folders")
    String vcsRemoveFilesLabel();
    @DefaultStringValue("@dDelete")
    String vcsRemoveFilesButtonLabel();
    @DefaultStringValue("@dDelete")
    String vcsRemoveFilesMenuLabel();
    @DefaultStringValue("@dDelete the selected files or folders")
    String vcsRemoveFilesDesc();
    
    // vcsDiff
    @DefaultStringValue("@dDiff Selected Files")
    String vcsDiffLabel();
    @DefaultStringValue("@dDiff")
    String vcsDiffButtonLabel();
    @DefaultStringValue("@dDiff")
    String vcsDiffMenuLabel();
    @DefaultStringValue("@dDiff selected file(s)")
    String vcsDiffDesc();
    
    // vcsCommit
    @DefaultStringValue("@dCommit Pending Changes")
    String vcsCommitLabel();
    @DefaultStringValue("@dCommit")
    String vcsCommitButtonLabel();
    @DefaultStringValue("@d_Commit...")
    String vcsCommitMenuLabel();
    @DefaultStringValue("@dCommit pending changes")
    String vcsCommitDesc();
    
    // vcsRevert
    @DefaultStringValue("@dRevert Changes")
    String vcsRevertLabel();
    @DefaultStringValue("@dRevert")
    String vcsRevertButtonLabel();
    @DefaultStringValue("@dRevert...")
    String vcsRevertMenuLabel();
    @DefaultStringValue("@dRevert selected changes")
    String vcsRevertDesc();
    
    // vcsShowHistory
    @DefaultStringValue("@dView History of Previous Commits")
    String vcsShowHistoryLabel();
    @DefaultStringValue("@dHistory")
    String vcsShowHistoryButtonLabel();
    @DefaultStringValue("@d_History")
    String vcsShowHistoryMenuLabel();
    @DefaultStringValue("@dView history of previous commits")
    String vcsShowHistoryDesc();
    
    // vcsRefresh
    @DefaultStringValue("@dRefresh File List from Source Control")
    String vcsRefreshLabel();
    @DefaultStringValue("@dRefresh listing")
    String vcsRefreshDesc();
    
    // vcsRefreshNoError
    
    // vcsOpen
    @DefaultStringValue("@dOpen Selected Files(s)")
    String vcsOpenLabel();
    @DefaultStringValue("@dOpen File")
    String vcsOpenMenuLabel();
    @DefaultStringValue("@dOpen selected file(s)")
    String vcsOpenDesc();
    
    // vcsIgnore
    @DefaultStringValue("@dIgnore Files or Folders")
    String vcsIgnoreLabel();
    @DefaultStringValue("@dIgnore")
    String vcsIgnoreButtonLabel();
    @DefaultStringValue("@dIgnore...")
    String vcsIgnoreMenuLabel();
    @DefaultStringValue("@dIgnore the selected files or folders")
    String vcsIgnoreDesc();
    
    // vcsPull
    @DefaultStringValue("@dPull")
    String vcsPullButtonLabel();
    @DefaultStringValue("@d_Pull Branches")
    String vcsPullMenuLabel();
    
    // vcsPullRebase
    @DefaultStringValue("@dPull with Rebase")
    String vcsPullRebaseButtonLabel();
    @DefaultStringValue("@d_Pull with Rebase")
    String vcsPullRebaseMenuLabel();
    
    // vcsPush
    @DefaultStringValue("@dPush")
    String vcsPushButtonLabel();
    @DefaultStringValue("@dP_ush Branch")
    String vcsPushMenuLabel();
    
    // vcsCleanup
    @DefaultStringValue("@dCleanup")
    String vcsCleanupButtonLabel();
    @DefaultStringValue("@dCleanu_p")
    String vcsCleanupMenuLabel();
    @DefaultStringValue("@dRecursively clean up the working copy (removing locks, etc)")
    String vcsCleanupDesc();
    
    // vcsResolve
    @DefaultStringValue("@dResolve")
    String vcsResolveButtonLabel();
    @DefaultStringValue("@dResolve...")
    String vcsResolveMenuLabel();
    @DefaultStringValue("@dResolve conflicts in the selected files or folders")
    String vcsResolveDesc();
    
    // consoleClear
    @DefaultStringValue("@dClear Console")
    String consoleClearLabel();
    @DefaultStringValue("@d")
    String consoleClearButtonLabel();
    @DefaultStringValue("@dCle_ar Console")
    String consoleClearMenuLabel();
    @DefaultStringValue("@dClear console")
    String consoleClearDesc();
    
    // clearBuild
    @DefaultStringValue("@dClear Build Pane Output")
    String clearBuildLabel();
    @DefaultStringValue("@d")
    String clearBuildButtonLabel();
    @DefaultStringValue("@dClear build")
    String clearBuildDesc();
    
    // interruptR
    @DefaultStringValue("@dInterrupt R Session")
    String interruptRLabel();
    @DefaultStringValue("@d")
    String interruptRButtonLabel();
    @DefaultStringValue("@d_Interrupt R")
    String interruptRMenuLabel();
    @DefaultStringValue("@dInterrupt R")
    String interruptRDesc();
    
    // restartR
    @DefaultStringValue("@dRestart R Session")
    String restartRLabel();
    @DefaultStringValue("@d_Restart R")
    String restartRMenuLabel();
    @DefaultStringValue("@dRestart R")
    String restartRDesc();
    
    // restartRClearOutput
    @DefaultStringValue("@dRestart R Session and Clear Chunk Output")
    String restartRClearOutputLabel();
    @DefaultStringValue("@dRestart R and Clear _Output")
    String restartRClearOutputMenuLabel();
    @DefaultStringValue("@dRestart R session and clear chunk output")
    String restartRClearOutputDesc();
    
    // restartRRunAllChunks
    @DefaultStringValue("@dRestart R Session and Run All Chunks")
    String restartRRunAllChunksLabel();
    @DefaultStringValue("@dRestart R and Run _All Chunks")
    String restartRRunAllChunksMenuLabel();
    @DefaultStringValue("@dRestart R session and run all chunks")
    String restartRRunAllChunksDesc();
    
    // terminateR
    @DefaultStringValue("@dTerminate R Session")
    String terminateRLabel();
    @DefaultStringValue("@d_Terminate R...")
    String terminateRMenuLabel();
    @DefaultStringValue("@dForcibly terminate R session")
    String terminateRDesc();
    
    // showPdfExternal
    @DefaultStringValue("@dShow PDF in External Viewer")
    String showPdfExternalLabel();
    @DefaultStringValue("@dShow PDF in External Viewer")
    String showPdfExternalMenuLabel();
    @DefaultStringValue("@dShow in an external PDF viewer window")
    String showPdfExternalDesc();
    
    // openHtmlExternal
    @DefaultStringValue("@dOpen Page with Web Browser")
    String openHtmlExternalLabel();
    @DefaultStringValue("@d")
    String openHtmlExternalButtonLabel();
    @DefaultStringValue("@dView the page with the system web browser")
    String openHtmlExternalDesc();
    
    // saveHtmlPreviewAsLocalFile
    @DefaultStringValue("@dFile on Local Computer...")
    String saveHtmlPreviewAsLocalFileMenuLabel();
    @DefaultStringValue("@dDownload the page to a local file")
    String saveHtmlPreviewAsLocalFileDesc();
    
    // saveHtmlPreviewAs
    @DefaultStringValue("@dSave As")
    String saveHtmlPreviewAsButtonLabel();
    @DefaultStringValue("@dFile on RStudio Server...")
    String saveHtmlPreviewAsMenuLabel();
    @DefaultStringValue("@dSave the page to another location")
    String saveHtmlPreviewAsDesc();
    
    // showHtmlPreviewLog
    @DefaultStringValue("@dLog")
    String showHtmlPreviewLogButtonLabel();
    @DefaultStringValue("@dShow the compilation log for this document")
    String showHtmlPreviewLogDesc();
    
    // refreshHtmlPreview
    @DefaultStringValue("@dRefresh the preview")
    String refreshHtmlPreviewDesc();
    
    // refreshPresentation
    @DefaultStringValue("@dRefresh the presentation")
    String refreshPresentationDesc();
    
    // presentationFullscreen
    @DefaultStringValue("@dShow presentation in full screen mode")
    String presentationFullscreenDesc();
    
    // presentationHome
    @DefaultStringValue("@dGo to the first slide")
    String presentationHomeDesc();
    
    // presentationNext
    @DefaultStringValue("@dGo to the next slide")
    String presentationNextDesc();
    
    // presentationPrev
    @DefaultStringValue("@dGo to the previous slide")
    String presentationPrevDesc();
    
    // presentationEdit
    @DefaultStringValue("@dEdit this slide of the presentation")
    String presentationEditDesc();
    
    // presentationViewInBrowser
    @DefaultStringValue("@d_View in Browser")
    String presentationViewInBrowserMenuLabel();
    @DefaultStringValue("@dView the presentation in an external web browser")
    String presentationViewInBrowserDesc();
    
    // presentationSaveAsStandalone
    @DefaultStringValue("@d_Save As Web Page...")
    String presentationSaveAsStandaloneMenuLabel();
    @DefaultStringValue("@dSave the presentation as a standalone web page")
    String presentationSaveAsStandaloneDesc();
    
    // clearPresentationCache
    @DefaultStringValue("@dClear Knitr Cache...")
    String clearPresentationCacheMenuLabel();
    @DefaultStringValue("@dClear knitr cache for this presentation")
    String clearPresentationCacheDesc();
    
    // historySendToSource
    @DefaultStringValue("@dInsert Command into Document")
    String historySendToSourceLabel();
    @DefaultStringValue("@dTo Source")
    String historySendToSourceButtonLabel();
    @DefaultStringValue("@dInsert into _Source")
    String historySendToSourceMenuLabel();
    @DefaultStringValue("@dInsert the selected commands into the current document (Shift+Enter)")
    String historySendToSourceDesc();
    
    // historySendToConsole
    @DefaultStringValue("@dSend Command to Console")
    String historySendToConsoleLabel();
    @DefaultStringValue("@dTo Console")
    String historySendToConsoleButtonLabel();
    @DefaultStringValue("@dSend to _Console")
    String historySendToConsoleMenuLabel();
    @DefaultStringValue("@dSend the selected commands to the R console (Enter)")
    String historySendToConsoleDesc();
    
    // loadHistory
    @DefaultStringValue("@d")
    String loadHistoryButtonLabel();
    @DefaultStringValue("@d_Load History...")
    String loadHistoryMenuLabel();
    @DefaultStringValue("@dLoad history from an existing file")
    String loadHistoryDesc();
    
    // saveHistory
    @DefaultStringValue("@d")
    String saveHistoryButtonLabel();
    @DefaultStringValue("@dSa_ve History As...")
    String saveHistoryMenuLabel();
    @DefaultStringValue("@dSave history into a file")
    String saveHistoryDesc();
    
    // historyRemoveEntries
    @DefaultStringValue("@d")
    String historyRemoveEntriesButtonLabel();
    @DefaultStringValue("@d_Remove Entries...")
    String historyRemoveEntriesMenuLabel();
    @DefaultStringValue("@dRemove the selected history entries")
    String historyRemoveEntriesDesc();
    
    // clearHistory
    @DefaultStringValue("@d")
    String clearHistoryButtonLabel();
    @DefaultStringValue("@dClear _All...")
    String clearHistoryMenuLabel();
    @DefaultStringValue("@dClear all history entries")
    String clearHistoryDesc();
    
    // historyDismissResults
    @DefaultStringValue("@dDismiss History Results")
    String historyDismissResultsLabel();
    @DefaultStringValue("@dDone")
    String historyDismissResultsButtonLabel();
    
    // historyShowContext
    @DefaultStringValue("@dShow In Context")
    String historyShowContextLabel();
    
    // historyDismissContext
    @DefaultStringValue("@dDismiss History Context")
    String historyDismissContextLabel();
    @DefaultStringValue("@d« Back")
    String historyDismissContextButtonLabel();
    
    // nextPlot
    @DefaultStringValue("@dShow Next Plot")
    String nextPlotLabel();
    @DefaultStringValue("@d")
    String nextPlotButtonLabel();
    @DefaultStringValue("@d_Next Plot")
    String nextPlotMenuLabel();
    @DefaultStringValue("@dNext plot")
    String nextPlotDesc();
    
    // previousPlot
    @DefaultStringValue("@dShow Previous Plot")
    String previousPlotLabel();
    @DefaultStringValue("@d")
    String previousPlotButtonLabel();
    @DefaultStringValue("@d_Previous Plot")
    String previousPlotMenuLabel();
    @DefaultStringValue("@dPrevious plot")
    String previousPlotDesc();
    
    // savePlotAsImage
    @DefaultStringValue("@dSave Plot As Image...")
    String savePlotAsImageLabel();
    @DefaultStringValue("@dSave as _Image...")
    String savePlotAsImageMenuLabel();
    @DefaultStringValue("@dSave the current plot as an image file")
    String savePlotAsImageDesc();
    
    // savePlotAsPdf
    @DefaultStringValue("@dSave Plot as PDF...")
    String savePlotAsPdfLabel();
    @DefaultStringValue("@dSave as P_DF...")
    String savePlotAsPdfMenuLabel();
    @DefaultStringValue("@dSave the current plot as a PDF file")
    String savePlotAsPdfDesc();
    
    // copyPlotToClipboard
    @DefaultStringValue("@dCopy Current Plot to Clipboard...")
    String copyPlotToClipboardLabel();
    @DefaultStringValue("@dCop_y to Clipboard...")
    String copyPlotToClipboardMenuLabel();
    @DefaultStringValue("@dCopy the current plot to the clipboard")
    String copyPlotToClipboardDesc();
    
    // zoomPlot
    @DefaultStringValue("@dZoom")
    String zoomPlotButtonLabel();
    @DefaultStringValue("@d_Zoom Plot...")
    String zoomPlotMenuLabel();
    @DefaultStringValue("@dView a larger version of the plot in a new window")
    String zoomPlotDesc();
    
    // removePlot
    @DefaultStringValue("@dRemove Current Plot...")
    String removePlotLabel();
    @DefaultStringValue("@d")
    String removePlotButtonLabel();
    @DefaultStringValue("@d_Remove Plot...")
    String removePlotMenuLabel();
    @DefaultStringValue("@dRemove the current plot")
    String removePlotDesc();
    
    // clearPlots
    @DefaultStringValue("@dClear All Plots...")
    String clearPlotsLabel();
    @DefaultStringValue("@d")
    String clearPlotsButtonLabel();
    @DefaultStringValue("@d_Clear All...")
    String clearPlotsMenuLabel();
    @DefaultStringValue("@dClear all Plots")
    String clearPlotsDesc();
    
    // refreshPlot
    @DefaultStringValue("@dRefresh Current Plot")
    String refreshPlotLabel();
    @DefaultStringValue("@d")
    String refreshPlotButtonLabel();
    @DefaultStringValue("@dRefresh")
    String refreshPlotMenuLabel();
    @DefaultStringValue("@dRefresh current plot")
    String refreshPlotDesc();
    
    // showManipulator
    @DefaultStringValue("@dShow Manipulator for Current Plot")
    String showManipulatorLabel();
    @DefaultStringValue("@d")
    String showManipulatorButtonLabel();
    @DefaultStringValue("@dShow _Manipulator")
    String showManipulatorMenuLabel();
    @DefaultStringValue("@dShow the manipulator for this plot")
    String showManipulatorDesc();
    
    // clearWorkspace
    @DefaultStringValue("@d_Clear Workspace...")
    String clearWorkspaceMenuLabel();
    @DefaultStringValue("@dClear objects from the workspace")
    String clearWorkspaceDesc();
    
    // loadWorkspace
    @DefaultStringValue("@d_Load Workspace...")
    String loadWorkspaceMenuLabel();
    @DefaultStringValue("@dLoad workspace")
    String loadWorkspaceDesc();
    
    // saveWorkspace
    @DefaultStringValue("@d_Save Workspace As...")
    String saveWorkspaceMenuLabel();
    @DefaultStringValue("@dSave workspace as")
    String saveWorkspaceDesc();
    
    // importDatasetFromFile
    @DefaultStringValue("@dImport Dataset from File...")
    String importDatasetFromFileLabel();
    @DefaultStringValue("@dFrom _Local File...")
    String importDatasetFromFileMenuLabel();
    
    // importDatasetFromURL
    @DefaultStringValue("@dImport Dataset from URL...")
    String importDatasetFromURLLabel();
    @DefaultStringValue("@dFrom _Web URL...")
    String importDatasetFromURLMenuLabel();
    
    // importDatasetFromCsv
    @DefaultStringValue("@dFrom CSV")
    String importDatasetFromCsvLabel();
    @DefaultStringValue("@dFrom _CSV")
    String importDatasetFromCsvMenuLabel();
    
    // importDatasetFromCsvUsingReadr
    @DefaultStringValue("@dFrom Text (readr)...")
    String importDatasetFromCsvUsingReadrLabel();
    @DefaultStringValue("@dFrom Text (_readr)...")
    String importDatasetFromCsvUsingReadrMenuLabel();
    
    // importDatasetFromCsvUsingBase
    @DefaultStringValue("@dFrom Text (base)...")
    String importDatasetFromCsvUsingBaseLabel();
    @DefaultStringValue("@dFrom Text (_base)...")
    String importDatasetFromCsvUsingBaseMenuLabel();
    
    // importDatasetFromSAV
    @DefaultStringValue("@dImport Dataset from SPSS...")
    String importDatasetFromSAVLabel();
    @DefaultStringValue("@dFrom _SPSS...")
    String importDatasetFromSAVMenuLabel();
    
    // importDatasetFromSAS
    @DefaultStringValue("@dImport Dataset from SAS...")
    String importDatasetFromSASLabel();
    @DefaultStringValue("@dFrom S_AS...")
    String importDatasetFromSASMenuLabel();
    
    // importDatasetFromStata
    @DefaultStringValue("@dImport Dataset from Stata...")
    String importDatasetFromStataLabel();
    @DefaultStringValue("@dFrom S_tata...")
    String importDatasetFromStataMenuLabel();
    
    // importDatasetFromXLS
    @DefaultStringValue("@dImport Dataset from Excel...")
    String importDatasetFromXLSLabel();
    @DefaultStringValue("@dFrom _Excel...")
    String importDatasetFromXLSMenuLabel();
    
    // refreshWorkspace
    @DefaultStringValue("@d")
    String refreshWorkspaceButtonLabel();
    @DefaultStringValue("@dRefresh")
    String refreshWorkspaceMenuLabel();
    @DefaultStringValue("@dRefresh Workspace")
    String refreshWorkspaceDesc();
    
    // installPackage
    @DefaultStringValue("@dInstall Packages...")
    String installPackageLabel();
    @DefaultStringValue("@dInstall")
    String installPackageButtonLabel();
    @DefaultStringValue("@dInstall Pac_kages...")
    String installPackageMenuLabel();
    @DefaultStringValue("@dInstall R packages")
    String installPackageDesc();
    
    // updatePackages
    @DefaultStringValue("@dUpdate Packages...")
    String updatePackagesLabel();
    @DefaultStringValue("@dUpdate")
    String updatePackagesButtonLabel();
    @DefaultStringValue("@dCheck for Package _Updates...")
    String updatePackagesMenuLabel();
    @DefaultStringValue("@dCheck for package updates")
    String updatePackagesDesc();
    
    // refreshPackages
    @DefaultStringValue("@dRefresh Packages Pane")
    String refreshPackagesLabel();
    @DefaultStringValue("@d")
    String refreshPackagesButtonLabel();
    @DefaultStringValue("@dRefresh Package listing")
    String refreshPackagesDesc();
    
    // packratBootstrap
    @DefaultStringValue("@dPackrat")
    String packratBootstrapButtonLabel();
    @DefaultStringValue("@d_Initialize Packrat...")
    String packratBootstrapMenuLabel();
    @DefaultStringValue("@dUse packrat with this project")
    String packratBootstrapDesc();
    
    // packratClean
    @DefaultStringValue("@d_Clean Unused Packages...")
    String packratCleanMenuLabel();
    @DefaultStringValue("@dRemove unused packages from your packrat library")
    String packratCleanDesc();
    
    // packratHelp
    @DefaultStringValue("@dUsing Packrat")
    String packratHelpMenuLabel();
    @DefaultStringValue("@dHelp on using packrat with R projects")
    String packratHelpDesc();
    
    // packratOptions
    @DefaultStringValue("@dOptions")
    String packratOptionsButtonLabel();
    @DefaultStringValue("@dPackrat _Options...")
    String packratOptionsMenuLabel();
    @DefaultStringValue("@dConfigure packrat options for this project")
    String packratOptionsDesc();
    
    // packratBundle
    @DefaultStringValue("@dBundle")
    String packratBundleButtonLabel();
    @DefaultStringValue("@dExport Project _Bundle...")
    String packratBundleMenuLabel();
    @DefaultStringValue("@dBundle a Packrat Project")
    String packratBundleDesc();
    
    // packratCheckStatus
    @DefaultStringValue("@dCheck Library _Status...")
    String packratCheckStatusMenuLabel();
    @DefaultStringValue("@dCheck the status of the Packrat library")
    String packratCheckStatusDesc();
    
    // renvHelp
    @DefaultStringValue("@dIntroduction to renv")
    String renvHelpMenuLabel();
    @DefaultStringValue("@dLearn how to use renv")
    String renvHelpDesc();
    
    // renvSnapshot
    @DefaultStringValue("@dSnapshot Library...")
    String renvSnapshotMenuLabel();
    @DefaultStringValue("@dSnapshot the state of your project library")
    String renvSnapshotDesc();
    
    // renvRestore
    @DefaultStringValue("@dRestore Library...")
    String renvRestoreMenuLabel();
    @DefaultStringValue("@dRestore your project library from renv.lock")
    String renvRestoreDesc();
    
    // versionControlOptions
    @DefaultStringValue("@d_Options...")
    String versionControlOptionsMenuLabel();
    @DefaultStringValue("@dConfigure version control options")
    String versionControlOptionsDesc();
    
    // versionControlHelp
    @DefaultStringValue("@d_Using Version Control")
    String versionControlHelpMenuLabel();
    @DefaultStringValue("@dHelp on using version control with RStudio")
    String versionControlHelpDesc();
    
    // versionControlShowRsaKey
    @DefaultStringValue("@dShow Public Key...")
    String versionControlShowRsaKeyLabel();
    @DefaultStringValue("@dShow Public Key...")
    String versionControlShowRsaKeyMenuLabel();
    @DefaultStringValue("@dShow RSA public key")
    String versionControlShowRsaKeyDesc();
    
    // versionControlProjectSetup
    @DefaultStringValue("@dProject _Setup...")
    String versionControlProjectSetupMenuLabel();
    @DefaultStringValue("@dSetup version control for the current project")
    String versionControlProjectSetupDesc();
    
    // showShellDialog
    @DefaultStringValue("@dOpen Shell")
    String showShellDialogLabel();
    @DefaultStringValue("@d_Shell...")
    String showShellDialogMenuLabel();
    @DefaultStringValue("@dExecute shell commands")
    String showShellDialogDesc();
    
    // newTerminal
    @DefaultStringValue("@dNew Terminal")
    String newTerminalLabel();
    @DefaultStringValue("@d_New Terminal")
    String newTerminalMenuLabel();
    @DefaultStringValue("@dCreate a new terminal")
    String newTerminalDesc();
    
    // activateTerminal
    @DefaultStringValue("@dMove Focus to Terminal")
    String activateTerminalLabel();
    @DefaultStringValue("@d_Move Focus to Terminal")
    String activateTerminalMenuLabel();
    
    // renameTerminal
    @DefaultStringValue("@dRename Terminal")
    String renameTerminalLabel();
    @DefaultStringValue("@d_Rename Terminal")
    String renameTerminalMenuLabel();
    @DefaultStringValue("@dChange terminal session name")
    String renameTerminalDesc();
    
    // closeTerminal
    @DefaultStringValue("@dClose Terminal")
    String closeTerminalLabel();
    @DefaultStringValue("@d")
    String closeTerminalButtonLabel();
    @DefaultStringValue("@dCl_ose Terminal")
    String closeTerminalMenuLabel();
    @DefaultStringValue("@dClose current terminal session")
    String closeTerminalDesc();
    
    // closeAllTerminals
    @DefaultStringValue("@dClose All Terminals")
    String closeAllTerminalsLabel();
    @DefaultStringValue("@d")
    String closeAllTerminalsButtonLabel();
    @DefaultStringValue("@dClose _All Terminals")
    String closeAllTerminalsMenuLabel();
    
    // clearTerminalScrollbackBuffer
    @DefaultStringValue("@dClear Terminal Buffer")
    String clearTerminalScrollbackBufferLabel();
    @DefaultStringValue("@d")
    String clearTerminalScrollbackBufferButtonLabel();
    @DefaultStringValue("@d_Clear Terminal Buffer")
    String clearTerminalScrollbackBufferMenuLabel();
    @DefaultStringValue("@dClear terminal")
    String clearTerminalScrollbackBufferDesc();
    
    // previousTerminal
    @DefaultStringValue("@dPrevious Terminal")
    String previousTerminalLabel();
    @DefaultStringValue("@d")
    String previousTerminalButtonLabel();
    @DefaultStringValue("@d_Previous Terminal")
    String previousTerminalMenuLabel();
    @DefaultStringValue("@dShow previous terminal")
    String previousTerminalDesc();
    
    // nextTerminal
    @DefaultStringValue("@dNext Terminal")
    String nextTerminalLabel();
    @DefaultStringValue("@d")
    String nextTerminalButtonLabel();
    @DefaultStringValue("@dNe_xt Terminal")
    String nextTerminalMenuLabel();
    @DefaultStringValue("@dShow next terminal")
    String nextTerminalDesc();
    
    // showTerminalInfo
    @DefaultStringValue("@dTerminal Diagnostics...")
    String showTerminalInfoLabel();
    @DefaultStringValue("@d")
    String showTerminalInfoButtonLabel();
    @DefaultStringValue("@dTerminal _Diagnostics...")
    String showTerminalInfoMenuLabel();
    @DefaultStringValue("@dShow info on current terminal")
    String showTerminalInfoDesc();
    
    // interruptTerminal
    @DefaultStringValue("@dSend Interrupt")
    String interruptTerminalLabel();
    @DefaultStringValue("@d")
    String interruptTerminalButtonLabel();
    @DefaultStringValue("@d_Interrupt Current Terminal")
    String interruptTerminalMenuLabel();
    @DefaultStringValue("@dSend Ctrl+C to Current Terminal")
    String interruptTerminalDesc();
    
    // sendTerminalToEditor
    @DefaultStringValue("@dCopy Terminal to Editor")
    String sendTerminalToEditorLabel();
    @DefaultStringValue("@d")
    String sendTerminalToEditorButtonLabel();
    @DefaultStringValue("@dCopy Terminal to _Editor")
    String sendTerminalToEditorMenuLabel();
    @DefaultStringValue("@dCopy current terminal's buffer to a new editor buffer")
    String sendTerminalToEditorDesc();
    
    // sendToTerminal
    @DefaultStringValue("@dSend Selection to Terminal")
    String sendToTerminalLabel();
    @DefaultStringValue("@d")
    String sendToTerminalButtonLabel();
    @DefaultStringValue("@dSend to _Terminal")
    String sendToTerminalMenuLabel();
    @DefaultStringValue("@dSend the current line or selection to terminal")
    String sendToTerminalDesc();
    
    // sendFilenameToTerminal
    @DefaultStringValue("@dSend _Filename to Terminal")
    String sendFilenameToTerminalMenuLabel();
    
    // openNewTerminalAtEditorLocation
    @DefaultStringValue("@d_Open New Terminal at File Location")
    String openNewTerminalAtEditorLocationMenuLabel();
    
    // openNewTerminalAtFilePaneLocation
    @DefaultStringValue("@dOpen New Terminal Here")
    String openNewTerminalAtFilePaneLocationMenuLabel();
    
    // setTerminalToCurrentDirectory
    @DefaultStringValue("@d_Go to Current Directory")
    String setTerminalToCurrentDirectoryMenuLabel();
    
    // browseAddins
    @DefaultStringValue("@dBrowse Addins")
    String browseAddinsLabel();
    @DefaultStringValue("@d_Browse Addins...")
    String browseAddinsMenuLabel();
    @DefaultStringValue("@dBrowse addins")
    String browseAddinsDesc();
    
    // macPreferences
    @DefaultStringValue("@d_Preferences...")
    String macPreferencesMenuLabel();
    
    // showOptions
    @DefaultStringValue("@d_Global Options...")
    String showOptionsMenuLabel();
    
    // showCodeOptions
    @DefaultStringValue("@dCode Options...")
    String showCodeOptionsLabel();
    
    // showConsoleOptions
    @DefaultStringValue("@dConsole Options...")
    String showConsoleOptionsLabel();
    
    // showAppearanceOptions
    @DefaultStringValue("@dAppearance Options...")
    String showAppearanceOptionsLabel();
    
    // paneLayout
    @DefaultStringValue("@dPane Layout Options...")
    String paneLayoutLabel();
    @DefaultStringValue("@dPane Layo_ut...")
    String paneLayoutMenuLabel();
    
    // showPackagesOptions
    @DefaultStringValue("@dPackages Options...")
    String showPackagesOptionsLabel();
    
    // showRMarkdownOptions
    @DefaultStringValue("@dR Markdown Options...")
    String showRMarkdownOptionsLabel();
    
    // showSweaveOptions
    @DefaultStringValue("@dSweave Options...")
    String showSweaveOptionsLabel();
    
    // showSpellingOptions
    @DefaultStringValue("@dSpelling Options...")
    String showSpellingOptionsLabel();
    
    // showVcsOptions
    @DefaultStringValue("@dGit/SVN Version Control Options...")
    String showVcsOptionsLabel();
    
    // showPublishingOptions
    @DefaultStringValue("@dPublishing Options...")
    String showPublishingOptionsLabel();
    
    // showTerminalOptions
    @DefaultStringValue("@d_Terminal Options...")
    String showTerminalOptionsMenuLabel();
    
    // showAccessibilityOptions
    @DefaultStringValue("@dAccessibility _Options...")
    String showAccessibilityOptionsMenuLabel();
    
    // showPythonOptions
    @DefaultStringValue("@dPython Options...")
    String showPythonOptionsLabel();
    
    // modifyKeyboardShortcuts
    @DefaultStringValue("@d_Modify Keyboard Shortcuts...")
    String modifyKeyboardShortcutsMenuLabel();
    @DefaultStringValue("@dModify keyboard shortcuts")
    String modifyKeyboardShortcutsDesc();
    
    // checkForUpdates
    @DefaultStringValue("@dCheck for RStudio Updates")
    String checkForUpdatesLabel();
    @DefaultStringValue("@dCheck for _Updates")
    String checkForUpdatesMenuLabel();
    
    // helpUsingRStudio
    @DefaultStringValue("@dRStudio _Docs")
    String helpUsingRStudioMenuLabel();
    
    // helpKeyboardShortcuts
    @DefaultStringValue("@d_Keyboard Shortcuts Help")
    String helpKeyboardShortcutsMenuLabel();
    
    // helpBack
    @DefaultStringValue("@dPrevious Help Topic")
    String helpBackLabel();
    @DefaultStringValue("@d")
    String helpBackButtonLabel();
    @DefaultStringValue("@dPrevious topic")
    String helpBackDesc();
    
    // helpForward
    @DefaultStringValue("@dNext Help Topic")
    String helpForwardLabel();
    @DefaultStringValue("@d")
    String helpForwardButtonLabel();
    @DefaultStringValue("@dNext topic")
    String helpForwardDesc();
    
    // helpHome
    @DefaultStringValue("@dShow R Help")
    String helpHomeLabel();
    @DefaultStringValue("@d")
    String helpHomeButtonLabel();
    @DefaultStringValue("@dR _Help")
    String helpHomeMenuLabel();
    @DefaultStringValue("@dShow R Help")
    String helpHomeDesc();
    
    // helpSearch
    @DefaultStringValue("@dSearch R Hel_p")
    String helpSearchMenuLabel();
    
    // printHelp
    @DefaultStringValue("@dPrint Help Topic")
    String printHelpLabel();
    @DefaultStringValue("@d")
    String printHelpButtonLabel();
    @DefaultStringValue("@dPrint topic")
    String printHelpDesc();
    
    // clearHelpHistory
    @DefaultStringValue("@dClear Help History")
    String clearHelpHistoryLabel();
    @DefaultStringValue("@dClear history")
    String clearHelpHistoryMenuLabel();
    @DefaultStringValue("@dClear history")
    String clearHelpHistoryDesc();
    
    // helpPopout
    @DefaultStringValue("@dShow Help in New Window")
    String helpPopoutLabel();
    @DefaultStringValue("@d")
    String helpPopoutButtonLabel();
    @DefaultStringValue("@dShow in new window")
    String helpPopoutDesc();
    
    // refreshHelp
    @DefaultStringValue("@dRefresh Help Topic")
    String refreshHelpLabel();
    @DefaultStringValue("@dRefresh")
    String refreshHelpMenuLabel();
    @DefaultStringValue("@dRefresh topic")
    String refreshHelpDesc();
    
    // tutorialPopout
    @DefaultStringValue("@d")
    String tutorialPopoutButtonLabel();
    @DefaultStringValue("@dShow in new window")
    String tutorialPopoutDesc();
    
    // tutorialBack
    @DefaultStringValue("@d")
    String tutorialBackButtonLabel();
    @DefaultStringValue("@dGo back")
    String tutorialBackDesc();
    
    // tutorialForward
    @DefaultStringValue("@d")
    String tutorialForwardButtonLabel();
    @DefaultStringValue("@dGo forward")
    String tutorialForwardDesc();
    
    // tutorialZoom
    @DefaultStringValue("@dZoom")
    String tutorialZoomButtonLabel();
    @DefaultStringValue("@dView a larger version in a new window")
    String tutorialZoomDesc();
    
    // tutorialRefresh
    @DefaultStringValue("@dRefresh tutorial")
    String tutorialRefreshDesc();
    
    // tutorialStop
    @DefaultStringValue("@d")
    String tutorialStopButtonLabel();
    @DefaultStringValue("@dStop tutorial")
    String tutorialStopDesc();
    
    // tutorialHome
    @DefaultStringValue("@d")
    String tutorialHomeButtonLabel();
    @DefaultStringValue("@dReturn to home")
    String tutorialHomeDesc();
    
    // viewerPopout
    @DefaultStringValue("@d")
    String viewerPopoutButtonLabel();
    @DefaultStringValue("@dShow in new window")
    String viewerPopoutDesc();
    
    // viewerBack
    @DefaultStringValue("@d")
    String viewerBackButtonLabel();
    @DefaultStringValue("@dGo back")
    String viewerBackDesc();
    
    // viewerForward
    @DefaultStringValue("@d")
    String viewerForwardButtonLabel();
    @DefaultStringValue("@dGo forward")
    String viewerForwardDesc();
    
    // viewerZoom
    @DefaultStringValue("@dZoom")
    String viewerZoomButtonLabel();
    @DefaultStringValue("@dView a larger version in a new window")
    String viewerZoomDesc();
    
    // viewerRefresh
    @DefaultStringValue("@dRefresh viewer")
    String viewerRefreshDesc();
    
    // viewerSaveAllAndRefresh
    @DefaultStringValue("@dSave source files and refresh viewer")
    String viewerSaveAllAndRefreshDesc();
    
    // viewerStop
    @DefaultStringValue("@d")
    String viewerStopButtonLabel();
    @DefaultStringValue("@dStop application")
    String viewerStopDesc();
    
    // viewerClear
    @DefaultStringValue("@d")
    String viewerClearButtonLabel();
    @DefaultStringValue("@dRemove current viewer item")
    String viewerClearDesc();
    
    // viewerClearAll
    @DefaultStringValue("@d")
    String viewerClearAllButtonLabel();
    @DefaultStringValue("@dClear all viewer items")
    String viewerClearAllDesc();
    
    // viewerSaveAsImage
    @DefaultStringValue("@dSave as Image...")
    String viewerSaveAsImageMenuLabel();
    @DefaultStringValue("@dSave as an image file")
    String viewerSaveAsImageDesc();
    
    // viewerSaveAsWebPage
    @DefaultStringValue("@dSave as Web Page...")
    String viewerSaveAsWebPageMenuLabel();
    @DefaultStringValue("@dSave as a standalone web page")
    String viewerSaveAsWebPageDesc();
    
    // viewerCopyToClipboard
    @DefaultStringValue("@dCopy to Clipboard...")
    String viewerCopyToClipboardMenuLabel();
    @DefaultStringValue("@dCopy to the system clipboard")
    String viewerCopyToClipboardDesc();
    
    // raiseException
    @DefaultStringValue("@dRaise E_xception")
    String raiseExceptionMenuLabel();
    
    // raiseException2
    @DefaultStringValue("@dRaise Exception _JS")
    String raiseException2MenuLabel();
    
    // showWarningBar
    @DefaultStringValue("@dShow warning bar")
    String showWarningBarMenuLabel();
    
    // showRequestLog
    @DefaultStringValue("@d_Request Log")
    String showRequestLogMenuLabel();
    @DefaultStringValue("@dShow internal request log")
    String showRequestLogDesc();
    
    // diagnosticsReport
    @DefaultStringValue("@d_Write Diagnostics Report")
    String diagnosticsReportMenuLabel();
    
    // openDeveloperConsole
    @DefaultStringValue("@d_Open Developer Console")
    String openDeveloperConsoleMenuLabel();
    
    // reloadUi
    @DefaultStringValue("@dReload _UI")
    String reloadUiMenuLabel();
    
    // logFocusedElement
    @DefaultStringValue("@dLog focused element")
    String logFocusedElementMenuLabel();
    
    // debugDumpContents
    @DefaultStringValue("@d_Dump Editor Contents...")
    String debugDumpContentsMenuLabel();
    
    // debugImportDump
    @DefaultStringValue("@d_Import Editor Contents...")
    String debugImportDumpMenuLabel();
    
    // refreshSuperDevMode
    
    // newSession
    @DefaultStringValue("@dOpen a New R Session")
    String newSessionLabel();
    @DefaultStringValue("@d")
    String newSessionButtonLabel();
    @DefaultStringValue("@d_New Session")
    String newSessionMenuLabel();
    @DefaultStringValue("@dOpen a new R session")
    String newSessionDesc();
    
    // suspendSession
    @DefaultStringValue("@dSuspend R Session")
    String suspendSessionLabel();
    @DefaultStringValue("@d_Suspend R Session")
    String suspendSessionMenuLabel();
    
    // quitSession
    @DefaultStringValue("@dQuit the Current R Session")
    String quitSessionLabel();
    @DefaultStringValue("@d")
    String quitSessionButtonLabel();
    @DefaultStringValue("@d_Quit Session...")
    String quitSessionMenuLabel();
    @DefaultStringValue("@dQuit the current R session")
    String quitSessionDesc();
    
    // forceQuitSession
    @DefaultStringValue("@dQuit the Current R Session Even if Busy")
    String forceQuitSessionLabel();
    @DefaultStringValue("@d")
    String forceQuitSessionButtonLabel();
    @DefaultStringValue("@dForce Quit Session...")
    String forceQuitSessionMenuLabel();
    @DefaultStringValue("@dQuit the current R session even if busy")
    String forceQuitSessionDesc();
    
    // showSessionServerOptionsDialog
    @DefaultStringValue("@dSession Server Settings...")
    String showSessionServerOptionsDialogLabel();
    @DefaultStringValue("@d")
    String showSessionServerOptionsDialogButtonLabel();
    @DefaultStringValue("@d_Session Server Settings...")
    String showSessionServerOptionsDialogMenuLabel();
    @DefaultStringValue("@dConfigure available session servers")
    String showSessionServerOptionsDialogDesc();
    
    // showAboutDialog
    @DefaultStringValue("@dAbout RStudio...")
    String showAboutDialogLabel();
    @DefaultStringValue("@dA_bout RStudio")
    String showAboutDialogMenuLabel();
    
    // showLicenseDialog
    @DefaultStringValue("@dManage License...")
    String showLicenseDialogLabel();
    @DefaultStringValue("@dMa_nage License...")
    String showLicenseDialogMenuLabel();
    
    // showLogFiles
    @DefaultStringValue("@d_Show Log Files")
    String showLogFilesMenuLabel();
    
    // updateCredentials
    @DefaultStringValue("@d_Update Credentials")
    String updateCredentialsMenuLabel();
    
    // rstudioCommunityForum
    @DefaultStringValue("@dRStudio Community _Forum")
    String rstudioCommunityForumMenuLabel();
    
    // rstudioSupport
    @DefaultStringValue("@dRStudio _Support")
    String rstudioSupportMenuLabel();
    
    // rstudioLicense
    @DefaultStringValue("@dRStudio _License")
    String rstudioLicenseMenuLabel();
    
    // buildAll
    @DefaultStringValue("@dInstall and Restart")
    String buildAllLabel();
    @DefaultStringValue("@dInstall and Restart")
    String buildAllButtonLabel();
    @DefaultStringValue("@d_Install and Restart")
    String buildAllMenuLabel();
    @DefaultStringValue("@dInstall the package and restart R")
    String buildAllDesc();
    
    // rebuildAll
    @DefaultStringValue("@dClean and Rebuild")
    String rebuildAllLabel();
    @DefaultStringValue("@dClean and _Rebuild")
    String rebuildAllMenuLabel();
    @DefaultStringValue("@dClean previous output and rebuild all")
    String rebuildAllDesc();
    
    // cleanAll
    @DefaultStringValue("@dClean All")
    String cleanAllLabel();
    @DefaultStringValue("@dClean")
    String cleanAllButtonLabel();
    @DefaultStringValue("@d_Clean All")
    String cleanAllMenuLabel();
    @DefaultStringValue("@dClean all")
    String cleanAllDesc();
    
    // buildSourcePackage
    @DefaultStringValue("@dBuild _Source Package")
    String buildSourcePackageMenuLabel();
    @DefaultStringValue("@dBuild a source package")
    String buildSourcePackageDesc();
    
    // buildBinaryPackage
    @DefaultStringValue("@dBuild Binar_y Package")
    String buildBinaryPackageMenuLabel();
    @DefaultStringValue("@dBuild a binary package")
    String buildBinaryPackageDesc();
    
    // devtoolsLoadAll
    @DefaultStringValue("@dExecute devtools::load_all()")
    String devtoolsLoadAllLabel();
    @DefaultStringValue("@d_Load All")
    String devtoolsLoadAllMenuLabel();
    @DefaultStringValue("@dExecute devtools::load_all")
    String devtoolsLoadAllDesc();
    
    // roxygenizePackage
    @DefaultStringValue("@dBuild Package Documentation")
    String roxygenizePackageLabel();
    @DefaultStringValue("@d_Document")
    String roxygenizePackageMenuLabel();
    @DefaultStringValue("@dBuild package documentation")
    String roxygenizePackageDesc();
    
    // checkPackage
    @DefaultStringValue("@dCheck")
    String checkPackageButtonLabel();
    @DefaultStringValue("@d_Check Package")
    String checkPackageMenuLabel();
    @DefaultStringValue("@dR CMD check")
    String checkPackageDesc();
    
    // testPackage
    @DefaultStringValue("@d_Test Package")
    String testPackageMenuLabel();
    @DefaultStringValue("@dRun tests for package")
    String testPackageDesc();
    
    // testTestthatFile
    @DefaultStringValue("@dRun testthat Tests")
    String testTestthatFileLabel();
    @DefaultStringValue("@dRun Tests")
    String testTestthatFileButtonLabel();
    @DefaultStringValue("@dRun tests for file")
    String testTestthatFileMenuLabel();
    @DefaultStringValue("@dRun tests using the testthat package")
    String testTestthatFileDesc();
    
    // testShinytestFile
    @DefaultStringValue("@dRun shinytest Test")
    String testShinytestFileLabel();
    @DefaultStringValue("@dRun Test")
    String testShinytestFileButtonLabel();
    @DefaultStringValue("@dRun test for file")
    String testShinytestFileMenuLabel();
    @DefaultStringValue("@dRun test using the shinytest package")
    String testShinytestFileDesc();
    
    // stopBuild
    @DefaultStringValue("@dSto_p Build")
    String stopBuildMenuLabel();
    @DefaultStringValue("@dStop the current build")
    String stopBuildDesc();
    
    // buildToolsProjectSetup
    @DefaultStringValue("@dConfigure Build Tools...")
    String buildToolsProjectSetupLabel();
    @DefaultStringValue("@dConfigure Build _Tools...")
    String buildToolsProjectSetupMenuLabel();
    @DefaultStringValue("@dConfigure build tools")
    String buildToolsProjectSetupDesc();
    
    // refreshEnvironment
    @DefaultStringValue("@d_Refresh Environment")
    String refreshEnvironmentMenuLabel();
    @DefaultStringValue("@dRefresh the list of objects in the environment")
    String refreshEnvironmentDesc();
    
    // undoDummy
    @DefaultStringValue("@d_Undo")
    String undoDummyMenuLabel();
    
    // redoDummy
    @DefaultStringValue("@dRe_do")
    String redoDummyMenuLabel();
    
    // cutDummy
    @DefaultStringValue("@dCu_t")
    String cutDummyMenuLabel();
    
    // copyDummy
    @DefaultStringValue("@d_Copy")
    String copyDummyMenuLabel();
    
    // pasteDummy
    @DefaultStringValue("@d_Paste")
    String pasteDummyMenuLabel();
    
    // pasteWithIndentDummy
    @DefaultStringValue("@dPa_ste with Indent")
    String pasteWithIndentDummyMenuLabel();
    
    // yankBeforeCursor
    @DefaultStringValue("@dYank Before Cursor")
    String yankBeforeCursorLabel();
    
    // yankAfterCursor
    @DefaultStringValue("@dYank After Cursor")
    String yankAfterCursorLabel();
    
    // pasteLastYank
    @DefaultStringValue("@dPaste Last Yank")
    String pasteLastYankLabel();
    
    // insertAssignmentOperator
    @DefaultStringValue("@dInsert Assignment Operator")
    String insertAssignmentOperatorLabel();
    
    // insertPipeOperator
    @DefaultStringValue("@dInsert Pipe Operator")
    String insertPipeOperatorLabel();
    
    // openNextFileOnFilesystem
    @DefaultStringValue("@dOpen Next File on Filesystem")
    String openNextFileOnFilesystemLabel();
    
    // openPreviousFileOnFilesystem
    @DefaultStringValue("@dOpen Previous File on Filesystem")
    String openPreviousFileOnFilesystemLabel();
    
    // toggleSoftWrapMode
    @DefaultStringValue("@dToggle Soft Wrap Mode")
    String toggleSoftWrapModeLabel();
    @DefaultStringValue("@dSoft _Wrap Long Lines")
    String toggleSoftWrapModeMenuLabel();
    
    // toggleRainbowParens
    @DefaultStringValue("@dToggle Rainbow Parentheses Mode")
    String toggleRainbowParensLabel();
    @DefaultStringValue("@dRain_bow Parentheses")
    String toggleRainbowParensMenuLabel();
    
    // maximizeConsole
    @DefaultStringValue("@dMaximize Console")
    String maximizeConsoleMenuLabel();
    
    // debugBreakpoint
    @DefaultStringValue("@dToggle Breakpoint on Current Line")
    String debugBreakpointLabel();
    @DefaultStringValue("@dToggle _Breakpoint")
    String debugBreakpointMenuLabel();
    @DefaultStringValue("@dSet or remove a breakpoint on the current line of code")
    String debugBreakpointDesc();
    
    // debugClearBreakpoints
    @DefaultStringValue("@dClear All Breakpoints...")
    String debugClearBreakpointsLabel();
    @DefaultStringValue("@dClear _All Breakpoints...")
    String debugClearBreakpointsMenuLabel();
    @DefaultStringValue("@dRemove all the breakpoints in the current project")
    String debugClearBreakpointsDesc();
    
    // debugContinue
    @DefaultStringValue("@dContinue Execution")
    String debugContinueLabel();
    @DefaultStringValue("@dContinue")
    String debugContinueButtonLabel();
    @DefaultStringValue("@d_Continue")
    String debugContinueMenuLabel();
    @DefaultStringValue("@dContinue execution until the next breakpoint is encountered")
    String debugContinueDesc();
    
    // debugStop
    @DefaultStringValue("@dStop Debugging")
    String debugStopLabel();
    @DefaultStringValue("@dStop")
    String debugStopButtonLabel();
    @DefaultStringValue("@d_Stop Debugging")
    String debugStopMenuLabel();
    @DefaultStringValue("@dExit debug mode")
    String debugStopDesc();
    
    // debugStep
    @DefaultStringValue("@dExecute Next Line")
    String debugStepLabel();
    @DefaultStringValue("@dNext")
    String debugStepButtonLabel();
    @DefaultStringValue("@dE_xecute Next Line")
    String debugStepMenuLabel();
    @DefaultStringValue("@dExecute the next line of code")
    String debugStepDesc();
    
    // debugStepInto
    @DefaultStringValue("@dStep Into Function")
    String debugStepIntoLabel();
    @DefaultStringValue("@d")
    String debugStepIntoButtonLabel();
    @DefaultStringValue("@dStep _Into Function")
    String debugStepIntoMenuLabel();
    @DefaultStringValue("@dStep into the current function call")
    String debugStepIntoDesc();
    
    // debugFinish
    @DefaultStringValue("@dFinish Function/Loop")
    String debugFinishLabel();
    @DefaultStringValue("@d")
    String debugFinishButtonLabel();
    @DefaultStringValue("@d_Finish Function/Loop")
    String debugFinishMenuLabel();
    @DefaultStringValue("@dExecute the remainder of the current function or loop")
    String debugFinishDesc();
    
    // debugHelp
    @DefaultStringValue("@dShow Guide on Debugging with RStudio")
    String debugHelpLabel();
    @DefaultStringValue("@dDebugging _Help")
    String debugHelpMenuLabel();
    @DefaultStringValue("@dGuide to debugging features")
    String debugHelpDesc();
    
    // errorsMessage
    @DefaultStringValue("@d_Message Only")
    String errorsMessageMenuLabel();
    @DefaultStringValue("@dPrint the error message when an unhandled error occurs")
    String errorsMessageDesc();
    
    // errorsTraceback
    @DefaultStringValue("@d_Error Inspector")
    String errorsTracebackMenuLabel();
    @DefaultStringValue("@dShow the error inspector when an unhandled error occurs")
    String errorsTracebackDesc();
    
    // errorsBreak
    @DefaultStringValue("@d_Break in Code")
    String errorsBreakMenuLabel();
    @DefaultStringValue("@dBreak when any unhandled error occurs")
    String errorsBreakDesc();
    
    // startProfiler
    @DefaultStringValue("@d_Start Profiling")
    String startProfilerMenuLabel();
    @DefaultStringValue("@dStart profiling R code")
    String startProfilerDesc();
    
    // stopProfiler
    @DefaultStringValue("@dStop Profiling")
    String stopProfilerButtonLabel();
    @DefaultStringValue("@dStop Profilin_g")
    String stopProfilerMenuLabel();
    @DefaultStringValue("@dStop profiling R code")
    String stopProfilerDesc();
    
    // profileCode
    @DefaultStringValue("@dProfile Current Line or Selection")
    String profileCodeLabel();
    @DefaultStringValue("@d")
    String profileCodeButtonLabel();
    @DefaultStringValue("@d_Profile Selected Line(s)")
    String profileCodeMenuLabel();
    @DefaultStringValue("@dProfile the current line or selection")
    String profileCodeDesc();
    
    // gotoProfileSource
    @DefaultStringValue("@dGo To Profile Sources")
    String gotoProfileSourceLabel();
    @DefaultStringValue("@d")
    String gotoProfileSourceButtonLabel();
    @DefaultStringValue("@dOpen sources associated with the selection")
    String gotoProfileSourceDesc();
    
    // profileCodeWithoutFocus
    @DefaultStringValue("@dProfile Current Line or Selection Without Focus")
    String profileCodeWithoutFocusLabel();
    
    // openProfile
    @DefaultStringValue("@dOpen Profile...")
    String openProfileLabel();
    @DefaultStringValue("@d_Open Profile...")
    String openProfileMenuLabel();
    @DefaultStringValue("@dOpens a profile from a file")
    String openProfileDesc();
    
    // saveProfileAs
    @DefaultStringValue("@dSave Profile As...")
    String saveProfileAsLabel();
    @DefaultStringValue("@d")
    String saveProfileAsButtonLabel();
    @DefaultStringValue("@d_Save Profile As...")
    String saveProfileAsMenuLabel();
    @DefaultStringValue("@dSaves current profile into a file")
    String saveProfileAsDesc();
    
    // openProfileInBrowser
    @DefaultStringValue("@dOpen Profile in Browser...")
    String openProfileInBrowserLabel();
    @DefaultStringValue("@d")
    String openProfileInBrowserButtonLabel();
    @DefaultStringValue("@d_Open Profile in Browser")
    String openProfileInBrowserMenuLabel();
    @DefaultStringValue("@dOpens current profile in a web browser")
    String openProfileInBrowserDesc();
    
    // profileHelp
    @DefaultStringValue("@dShow Guide on Profiling with RStudio")
    String profileHelpLabel();
    @DefaultStringValue("@dProfiling _Help")
    String profileHelpMenuLabel();
    @DefaultStringValue("@dGuide to profiling features")
    String profileHelpDesc();
    
    // reloadShinyApp
    @DefaultStringValue("@dReload Shiny Application")
    String reloadShinyAppLabel();
    @DefaultStringValue("@d")
    String reloadShinyAppButtonLabel();
    @DefaultStringValue("@dReload")
    String reloadShinyAppMenuLabel();
    @DefaultStringValue("@dReload the Shiny application")
    String reloadShinyAppDesc();
    
    // shinyRunInPane
    @DefaultStringValue("@dRun Shiny Application in New Pane")
    String shinyRunInPaneLabel();
    @DefaultStringValue("@dRun in Viewer Pane")
    String shinyRunInPaneMenuLabel();
    @DefaultStringValue("@dRun the Shiny application in an RStudio pane")
    String shinyRunInPaneDesc();
    
    // shinyRunInViewer
    @DefaultStringValue("@dRun Shiny Application in RStudio Viewer")
    String shinyRunInViewerLabel();
    @DefaultStringValue("@dRun in Window")
    String shinyRunInViewerMenuLabel();
    @DefaultStringValue("@dRun the Shiny application in an RStudio viewer window")
    String shinyRunInViewerDesc();
    
    // shinyRunInBrowser
    @DefaultStringValue("@dRun Shiny Application in Web Browser")
    String shinyRunInBrowserLabel();
    @DefaultStringValue("@dRun External")
    String shinyRunInBrowserMenuLabel();
    @DefaultStringValue("@dRun the Shiny application in the system's default Web browser")
    String shinyRunInBrowserDesc();
    
    // shinyRecordTest
    @DefaultStringValue("@dRecord a test for Shiny")
    String shinyRecordTestLabel();
    @DefaultStringValue("@dRecord Test")
    String shinyRecordTestButtonLabel();
    @DefaultStringValue("@dRecord Test")
    String shinyRecordTestMenuLabel();
    @DefaultStringValue("@dRecord test for Shiny application")
    String shinyRecordTestDesc();
    
    // shinyRunAllTests
    @DefaultStringValue("@dRun tests for Shiny application")
    String shinyRunAllTestsLabel();
    @DefaultStringValue("@dRun Tests")
    String shinyRunAllTestsButtonLabel();
    @DefaultStringValue("@dRun Tests")
    String shinyRunAllTestsMenuLabel();
    @DefaultStringValue("@dRun tests for Shiny application")
    String shinyRunAllTestsDesc();
    
    // shinyCompareTest
    @DefaultStringValue("@dCompare test results for Shiny application")
    String shinyCompareTestLabel();
    @DefaultStringValue("@dCompare Results")
    String shinyCompareTestButtonLabel();
    @DefaultStringValue("@dCompare Results")
    String shinyCompareTestMenuLabel();
    @DefaultStringValue("@dCompare test results for Shiny application")
    String shinyCompareTestDesc();
    
    // reloadPlumberAPI
    @DefaultStringValue("@dReload Plumber API")
    String reloadPlumberAPILabel();
    @DefaultStringValue("@d")
    String reloadPlumberAPIButtonLabel();
    @DefaultStringValue("@dReload")
    String reloadPlumberAPIMenuLabel();
    @DefaultStringValue("@dReload the Plumber API")
    String reloadPlumberAPIDesc();
    
    // plumberRunInPane
    @DefaultStringValue("@dRun Plumber API in New Pane")
    String plumberRunInPaneLabel();
    @DefaultStringValue("@dRun in Viewer Pane")
    String plumberRunInPaneMenuLabel();
    @DefaultStringValue("@dRun the Plumber API in an RStudio pane")
    String plumberRunInPaneDesc();
    
    // plumberRunInViewer
    @DefaultStringValue("@dRun Plumber API in RStudio Viewer")
    String plumberRunInViewerLabel();
    @DefaultStringValue("@dRun in Window")
    String plumberRunInViewerMenuLabel();
    @DefaultStringValue("@dRun the Plumber API in an RStudio viewer window")
    String plumberRunInViewerDesc();
    
    // plumberRunInBrowser
    @DefaultStringValue("@dRun Plumber API in Web Browser")
    String plumberRunInBrowserLabel();
    @DefaultStringValue("@dRun External")
    String plumberRunInBrowserMenuLabel();
    @DefaultStringValue("@dRun the Plumber API in the system's default Web browser")
    String plumberRunInBrowserDesc();
    
    // rsconnectDeploy
    @DefaultStringValue("@dP_ublish...")
    String rsconnectDeployMenuLabel();
    @DefaultStringValue("@dPublish the application or document")
    String rsconnectDeployDesc();
    
    // rsconnectConfigure
    @DefaultStringValue("@d_Configure Application...")
    String rsconnectConfigureMenuLabel();
    @DefaultStringValue("@dConfigure the application")
    String rsconnectConfigureDesc();
    
    // rsconnectManageAccounts
    @DefaultStringValue("@d_Manage Accounts...")
    String rsconnectManageAccountsMenuLabel();
    @DefaultStringValue("@dConnect or disconnect accounts")
    String rsconnectManageAccountsDesc();
    
    // showGpuDiagnostics
    @DefaultStringValue("@dShow _GPU Diagnostics")
    String showGpuDiagnosticsMenuLabel();
    
    // toggleEditorTokenInfo
    @DefaultStringValue("@d_Toggle Editor Token Information")
    String toggleEditorTokenInfoMenuLabel();
    
    // showDomElements
    @DefaultStringValue("@d_Show DOM Elements")
    String showDomElementsMenuLabel();
    
    // newConnection
    @DefaultStringValue("@dNew Connection")
    String newConnectionButtonLabel();
    @DefaultStringValue("@dNew Connection...")
    String newConnectionMenuLabel();
    @DefaultStringValue("@dCreate a new connection")
    String newConnectionDesc();
    
    // removeConnection
    @DefaultStringValue("@d")
    String removeConnectionButtonLabel();
    @DefaultStringValue("@dRemove Connection...")
    String removeConnectionMenuLabel();
    @DefaultStringValue("@dRemove connection from the connection history")
    String removeConnectionDesc();
    
    // disconnectConnection
    @DefaultStringValue("@dDisconnect")
    String disconnectConnectionMenuLabel();
    @DefaultStringValue("@dDisconnect from a connection")
    String disconnectConnectionDesc();
    
    // refreshConnection
    @DefaultStringValue("@dRefresh Connection Data")
    String refreshConnectionLabel();
    @DefaultStringValue("@dRefresh")
    String refreshConnectionMenuLabel();
    @DefaultStringValue("@dRefresh data")
    String refreshConnectionDesc();
    
    // sparkLog
    @DefaultStringValue("@dView Spark Log")
    String sparkLogLabel();
    @DefaultStringValue("@dLog")
    String sparkLogButtonLabel();
    @DefaultStringValue("@dSpark Log")
    String sparkLogMenuLabel();
    @DefaultStringValue("@dView the log for the Spark connection")
    String sparkLogDesc();
    
    // sparkUI
    @DefaultStringValue("@dSparkUI")
    String sparkUIButtonLabel();
    @DefaultStringValue("@dSparkUI")
    String sparkUIMenuLabel();
    @DefaultStringValue("@dView the browser UI for the Spark connection")
    String sparkUIDesc();
    
    // sparkHelp
    @DefaultStringValue("@d")
    String sparkHelpButtonLabel();
    @DefaultStringValue("@dUsing Spark with RStudio")
    String sparkHelpMenuLabel();
    @DefaultStringValue("@dHelp on using Spark with RStudio")
    String sparkHelpDesc();
    
    // startJob
    @DefaultStringValue("@dStart Local Job")
    String startJobButtonLabel();
    @DefaultStringValue("@d_Start Local Job...")
    String startJobMenuLabel();
    @DefaultStringValue("@dRun a background local job")
    String startJobDesc();
    
    // sourceAsJob
    @DefaultStringValue("@dSource as Local Job...")
    String sourceAsJobMenuLabel();
    @DefaultStringValue("@dRun the current R script as a local job")
    String sourceAsJobDesc();
    
    // clearJobs
    @DefaultStringValue("@d_Clear Local Jobs")
    String clearJobsMenuLabel();
    @DefaultStringValue("@dClean up all completed local jobs")
    String clearJobsDesc();
    
    // runSelectionAsJob
    @DefaultStringValue("@dRu_n Selection as Local Job")
    String runSelectionAsJobMenuLabel();
    @DefaultStringValue("@dRun the selected code as a local job")
    String runSelectionAsJobDesc();
    
    // startLauncherJob
    @DefaultStringValue("@dStart Launcher Job")
    String startLauncherJobButtonLabel();
    @DefaultStringValue("@dStart Launcher _Job...")
    String startLauncherJobMenuLabel();
    @DefaultStringValue("@dRun a background job on a cluster")
    String startLauncherJobDesc();
    
    // sourceAsLauncherJob
    @DefaultStringValue("@dSource as Launcher Job...")
    String sourceAsLauncherJobMenuLabel();
    @DefaultStringValue("@dRun the current R script on a cluster")
    String sourceAsLauncherJobDesc();
    
    // runSelectionAsLauncherJob
    @DefaultStringValue("@dRun Selection as _Launcher Job")
    String runSelectionAsLauncherJobMenuLabel();
    @DefaultStringValue("@dRun the selected code as a launcher job")
    String runSelectionAsLauncherJobDesc();
    
    // sortLauncherJobsRecorded
    @DefaultStringValue("@dSort by Submission Time")
    String sortLauncherJobsRecordedMenuLabel();
    @DefaultStringValue("@dSort jobs by time submitted")
    String sortLauncherJobsRecordedDesc();
    
    // sortLauncherJobsState
    @DefaultStringValue("@dSort by Job State")
    String sortLauncherJobsStateMenuLabel();
    @DefaultStringValue("@dSort jobs by current state")
    String sortLauncherJobsStateDesc();
    
    // showFileMenu
    @DefaultStringValue("@dShow File Menu")
    String showFileMenuMenuLabel();
    
    // showEditMenu
    @DefaultStringValue("@dShow Edit Menu")
    String showEditMenuMenuLabel();
    
    // showCodeMenu
    @DefaultStringValue("@dShow Code Menu")
    String showCodeMenuMenuLabel();
    
    // showViewMenu
    @DefaultStringValue("@dShow View Menu")
    String showViewMenuMenuLabel();
    
    // showPlotsMenu
    @DefaultStringValue("@dShow Plots Menu")
    String showPlotsMenuMenuLabel();
    
    // showSessionMenu
    @DefaultStringValue("@dShow Session Menu")
    String showSessionMenuMenuLabel();
    
    // showBuildMenu
    @DefaultStringValue("@dShow Build Menu")
    String showBuildMenuMenuLabel();
    
    // showDebugMenu
    @DefaultStringValue("@dShow Debug Menu")
    String showDebugMenuMenuLabel();
    
    // showProfileMenu
    @DefaultStringValue("@dShow Profile Menu")
    String showProfileMenuMenuLabel();
    
    // showToolsMenu
    @DefaultStringValue("@dShow Tools Menu")
    String showToolsMenuMenuLabel();
    
    // showHelpMenu
    @DefaultStringValue("@dShow Help Menu")
    String showHelpMenuMenuLabel();
    
    // editUserPrefs
    @DefaultStringValue("@d_Edit User Prefs File")
    String editUserPrefsMenuLabel();
    
    // clearUserPrefs
    @DefaultStringValue("@d_Clear User Prefs")
    String clearUserPrefsMenuLabel();
    
    // viewAllPrefs
    @DefaultStringValue("@d_View All Prefs")
    String viewAllPrefsMenuLabel();
    
    // toggleScreenReaderSupport
    @DefaultStringValue("@d_Screen Reader Support")
    String toggleScreenReaderSupportMenuLabel();
    
    // showAccessibilityHelp
    @DefaultStringValue("@dAccessibility _Help...")
    String showAccessibilityHelpMenuLabel();
    
    // toggleTabKeyMovesFocus
    @DefaultStringValue("@d_Tab Key Always Moves Focus")
    String toggleTabKeyMovesFocusMenuLabel();
    
    // focusMainToolbar
    @DefaultStringValue("@dFocus _Main Toolbar")
    String focusMainToolbarMenuLabel();
    
    // focusConsoleOutputEnd
    @DefaultStringValue("@d_Focus Console Output")
    String focusConsoleOutputEndMenuLabel();
    
    // focusNextPane
    @DefaultStringValue("@d_Focus Next Pane")
    String focusNextPaneMenuLabel();
    
    // focusPreviousPane
    @DefaultStringValue("@d_Focus Previous Pane")
    String focusPreviousPaneMenuLabel();
    
    // signOut
    @DefaultStringValue("@dSign Out")
    String signOutLabel();
    @DefaultStringValue("@d")
    String signOutButtonLabel();
    @DefaultStringValue("@dSign Ou_t")
    String signOutMenuLabel();
    @DefaultStringValue("@dSign out from RStudio")
    String signOutDesc();
    
    // loadServerHome
    @DefaultStringValue("@d")
    String loadServerHomeButtonLabel();
    @DefaultStringValue("@dRStudio Server _Home")
    String loadServerHomeMenuLabel();
    
    // speakEditorLocation
    @DefaultStringValue("@dSpeak Text _Editor Location")
    String speakEditorLocationMenuLabel();
    
    // focusLeftSeparator
    @DefaultStringValue("@dA_djust Left Splitter")
    String focusLeftSeparatorMenuLabel();
    
    // focusRightSeparator
    @DefaultStringValue("@dAd_just Right Splitter")
    String focusRightSeparatorMenuLabel();
    
    // focusCenterSeparator
    @DefaultStringValue("@dAdjust Center S_plitter")
    String focusCenterSeparatorMenuLabel();
    
    // focusSourceColumnSeparator
    @DefaultStringValue("@dAdjust Source Column Spli_tter")
    String focusSourceColumnSeparatorMenuLabel();
    
    // showShortcutCommand
    @DefaultStringValue("@dShow _Keyboard Shortcut Commands")
    String showShortcutCommandMenuLabel();
    
    // showCommandPalette
    @DefaultStringValue("@dShow Command Palette")
    String showCommandPaletteLabel();
    @DefaultStringValue("@dShow _Command Palette")
    String showCommandPaletteMenuLabel();
    
    // clearCommandPaletteMru
    @DefaultStringValue("@dClear Recently Executed Command List")
    String clearCommandPaletteMruMenuLabel();
    
    // freeUnusedMemory
    @DefaultStringValue("@d_Free Unused R Memory")
    String freeUnusedMemoryMenuLabel();
    
    // showMemoryUsageReport
    @DefaultStringValue("@dMemory Usage _Report...")
    String showMemoryUsageReportMenuLabel();
    
    // toggleShowMemoryUsage
    @DefaultStringValue("@dToggle Memory Usage Display in Environment Pane")
    String toggleShowMemoryUsageLabel();
    @DefaultStringValue("@d_Show Current Memory Usage")
    String toggleShowMemoryUsageMenuLabel();
    
}