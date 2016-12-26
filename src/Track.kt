import java.time.Duration
import java.time.Instant
import java.util.*

data class Track(
    val name: String,
    val startAt: Instant,
    val endAt: Instant,
    val points: MutableList<TrackPoint> = ArrayList()
) {
  val duration = Duration.between(startAt, endAt)
}

data class TrackPoint(
    val time: Instant,
    val lat: Float,
    val lon: Float
)