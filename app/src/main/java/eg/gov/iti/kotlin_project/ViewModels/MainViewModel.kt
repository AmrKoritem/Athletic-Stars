package eg.gov.iti.kotlin_project.ViewModels

import android.arch.lifecycle.ViewModel
import eg.gov.iti.kotlin_project.Repository.AthletesRepository

class MainViewModel (private val athletesRepository: AthletesRepository)
    : ViewModel() {
}