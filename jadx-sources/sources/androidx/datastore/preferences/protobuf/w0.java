package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f1031a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1032b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f1033c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1034d;

    public w0(w wVar, String str, Object[] objArr) {
        this.f1031a = wVar;
        this.f1032b = str;
        this.f1033c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < '\ud800') {
            this.f1034d = cCharAt;
            return;
        }
        int i10 = cCharAt & '\u1fff';
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < '\ud800') {
                this.f1034d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & '\u1fff') << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    public final int a() {
        int i10 = this.f1034d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
