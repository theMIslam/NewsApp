package com.london.newsapp.presentation.nvgraph

sealed class Route(
    val route: String
) {

    object OnBoardingScreen : Route(route = "onBoardingScreen")
    object HomeScreen : Route(route = "homeScreen")
    object SearchScreen : Route(route = "searchScreen")
    object BookmarkScreen : Route(route = "bookmarkScreen")
    object DetailScreen : Route(route = "detailsScreen")
    object NewsNavigatorScreen : Route(route = "newsNavigator")
    object AppStartNavigation : Route(route = "AppStartNavigation")
    object NewsNavigation: Route(route = "newsNavigation")

}
