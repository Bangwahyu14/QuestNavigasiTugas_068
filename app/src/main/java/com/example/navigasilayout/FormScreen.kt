package com.example.navigasilayout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


@Composable
fun FormScreen(modifier: Modifier = Modifier,
               onBackClick: () -> Unit) {
    var namaLengkap by remember { mutableStateOf(TextFieldValue("")) }
    var jenisKelamin by remember { mutableStateOf(TextFieldValue("")) }
    var statusPerkawinan by remember { mutableStateOf(TextFieldValue("")) }
    var alamat by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    )
    {
        Text(
            text = stringResource(R.string.form_title), // 🔧 teks diambil dari strings.xml
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF4B4BFF),
            modifier = Modifier.padding(bottom = 24.dp)
        )
        Text(text = stringResource(R.string.label_nama_lengkap), fontWeight = FontWeight.Medium)
        OutlinedTextField(
            value = namaLengkap,
            onValueChange = { namaLengkap = it },
            label = { Text(stringResource(R.string.label_nama_lengkap)) },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = stringResource(R.string.label_jenis_kelamin), fontWeight = FontWeight.Medium)
        OutlinedTextField(
            value = jenisKelamin,
            onValueChange = { jenisKelamin = it },
            label = { Text(stringResource(R.string.label_jenis_kelamin)) },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = stringResource(R.string.label_status_perkawinan), fontWeight = FontWeight.Medium)
        OutlinedTextField(
            value = statusPerkawinan,
            onValueChange = { statusPerkawinan = it },
            label = { Text(stringResource(R.string.label_status_perkawinan)) },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = stringResource(R.string.label_alamat), fontWeight = FontWeight.Medium)
        OutlinedTextField(
            value = alamat,
            onValueChange = { alamat = it },
            label = { Text(stringResource(R.string.label_alamat)) },
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                println("Nama: ${namaLengkap.text}")
                println("Jenis Kelamin: ${jenisKelamin.text}")
                println("Status: ${statusPerkawinan.text}")
                println("Alamat: ${alamat.text}")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6C63FF))
        ) {
            Text(
                text = stringResource(R.string.submit_button),
                color = Color.White,
                fontSize = 16.sp
            )
        }
        Spacer(modifier = Modifier.height(12.dp))

        // 🔧 DITAMBAHKAN: tombol untuk kembali ke beranda
        Button(
            onClick = { onBackClick() },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
        ) {
            Text(
                text = "Kembali ke Beranda",
                color = Color.White,
                fontSize = 16.sp
            )
        }
    }
}




