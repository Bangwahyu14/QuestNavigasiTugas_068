package com.example.navigasilayout

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun FormScreen(modifier: Modifier = Modifier) {
    var namaLengkap by remember { mutableStateOf(TextFieldValue("")) }
    var jenisKelamin by remember { mutableStateOf(TextFieldValue("")) }
    var statusPerkawinan by remember { mutableStateOf(TextFieldValue("")) }
    var alamat by remember { mutableStateOf(TextFieldValue("")) }
