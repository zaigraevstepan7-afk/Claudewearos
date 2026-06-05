package t7;

import android.content.Context;
import android.util.Log;
import t.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m implements s1, yd.b {

    /* renamed from: b, reason: collision with root package name */
    public static m f16122b;

    /* renamed from: a, reason: collision with root package name */
    public final int f16123a;

    public /* synthetic */ m(int i10) {
        this.f16123a = i10;
    }

    public static synchronized m g() {
        try {
            if (f16122b == null) {
                f16122b = new m(3);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f16122b;
    }

    public static String l(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public void c(String str, String str2, Throwable... thArr) {
        if (this.f16123a <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    @Override // t.q1
    public t.p d(long j, t.p pVar, t.p pVar2, t.p pVar3) {
        return j < ((long) this.f16123a) * 1000000 ? pVar : pVar2;
    }

    @Override // yd.b
    public int e(Context context, String str, boolean z2) {
        return 0;
    }

    public void f(String str, String str2, Throwable... thArr) {
        if (this.f16123a <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    @Override // yd.b
    public int h(Context context, String str) {
        return this.f16123a;
    }

    public void i(String str, String str2, Throwable... thArr) {
        if (this.f16123a <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    public void m(String str, String str2, Throwable... thArr) {
        if (this.f16123a <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    @Override // t.s1
    public int o() {
        return this.f16123a;
    }

    @Override // t.s1
    public int t() {
        return 0;
    }

    @Override // t.q1
    public t.p k(long j, t.p pVar, t.p pVar2, t.p pVar3) {
        return pVar3;
    }
}
