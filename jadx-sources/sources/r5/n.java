package r5;

import android.os.Trace;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = p4.g.f12796a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (k.d()) {
                k.a().e();
            }
            Trace.endSection();
        } catch (Throwable th2) {
            int i11 = p4.g.f12796a;
            Trace.endSection();
            throw th2;
        }
    }
}
