package com.absinthe.libchecker.features.statistics.bean

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LibChip(
  val iconRes: Int,
  val name: String,
  val regexName: String? = null
) : Parcelable
