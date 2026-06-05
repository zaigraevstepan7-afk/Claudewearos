package w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends pf.e {

    /* renamed from: c, reason: collision with root package name */
    public static e f18248c;

    @Override // pf.e
    public final int[] c(int i10) {
        int length = e().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < length && e().charAt(i10) == '\n' && (e().charAt(i10) == '\n' || (i10 != 0 && e().charAt(i10 - 1) != '\n'))) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !i(i11)) {
            i11++;
        }
        return d(i10, i11);
    }

    @Override // pf.e
    public final int[] h(int i10) {
        int length = e().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && e().charAt(i10 - 1) == '\n' && !i(i10)) {
            i10--;
        }
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && (e().charAt(i11) == '\n' || (i11 != 0 && e().charAt(i11 - 1) != '\n'))) {
            i11--;
        }
        return d(i11, i10);
    }

    public final boolean i(int i10) {
        if (i10 <= 0 || e().charAt(i10 - 1) == '\n') {
            return false;
        }
        return i10 == e().length() || e().charAt(i10) == '\n';
    }
}
