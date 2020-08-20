fun  main() {
    val hasil = 77
    val nilai: Char
    nilai = if (hasil <= 100 && hasil >= 90) {
        'A'
    } else if (hasil <= 89 && hasil >= 80) {
        'B'
    } else if (hasil <= 78 && hasil >= 70) {
        'C'
    } else if (hasil <= 65 && hasil >= 60) {
        'D'
    } else
        'E'

    print(nilai)
}
