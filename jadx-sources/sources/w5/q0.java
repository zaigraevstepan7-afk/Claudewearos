package w5;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q0 extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f18727b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final String f18726a = "FragmentManager";

    public final void b() {
        StringBuilder sb2 = this.f18727b;
        if (sb2.length() > 0) {
            Log.d(this.f18726a, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        b();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c6 = cArr[i10 + i12];
            if (c6 == '\n') {
                b();
            } else {
                this.f18727b.append(c6);
            }
        }
    }
}
