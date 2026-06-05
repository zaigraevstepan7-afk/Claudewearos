package qd;

import android.util.Log;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f13474a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13475b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13476c;

    public a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.f13475b = string;
        this.f13474a = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (!(length <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f13474a, i10)) {
            i10++;
        }
        this.f13476c = i10;
    }

    public final void a(String str, Object... objArr) {
        if (this.f13476c <= 3) {
            Log.d(this.f13474a, d(str, objArr));
        }
    }

    public final void b(String str, Exception exc, Object... objArr) {
        Log.e(this.f13474a, d(str, objArr), exc);
    }

    public final void c(String str, Object... objArr) {
        Log.e(this.f13474a, d(str, objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f13475b.concat(str);
    }

    public final void e(String str, Object... objArr) {
        if (this.f13476c <= 2) {
            Log.v(this.f13474a, d(str, objArr));
        }
    }

    public final void f(String str, Object... objArr) {
        Log.w(this.f13474a, d(str, objArr));
    }
}
