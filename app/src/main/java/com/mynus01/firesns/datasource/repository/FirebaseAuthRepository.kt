package com.mynus01.firesns.datasource.repository

import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult

interface FirebaseAuthRepository {
    fun signUp(email: String, password: String): Task<AuthResult>
}