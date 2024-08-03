package otus.homework.customview.pie_chart

import android.os.Parcelable
import android.view.View.BaseSavedState

/**
 * Собственный state для сохранения и восстановление данных
 */
class PieChartState(
    private val superSavedState: Parcelable?,
    val dataList: List<PieChartData>
) : BaseSavedState(superSavedState), Parcelable {
}