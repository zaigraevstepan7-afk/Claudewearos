package c3;

import ab.q;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.lifecycle.h0;
import c1.n3;
import c2.e0;
import d3.r;
import f1.j1;
import java.util.function.Consumer;
import qj.b0;
import qj.o1;
import qj.s1;
import s3.k;
import w2.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final r f3077a;

    /* renamed from: b, reason: collision with root package name */
    public final k f3078b;

    /* renamed from: c, reason: collision with root package name */
    public final ag.i f3079c;

    /* renamed from: d, reason: collision with root package name */
    public final t f3080d;

    /* renamed from: e, reason: collision with root package name */
    public final vj.d f3081e;

    /* renamed from: f, reason: collision with root package name */
    public final h f3082f;

    public c(r rVar, k kVar, vj.d dVar, ag.i iVar, t tVar) {
        this.f3077a = rVar;
        this.f3078b = kVar;
        this.f3079c = iVar;
        this.f3080d = tVar;
        this.f3081e = new vj.d(dVar.f18092a.V(f.f3087a));
        this.f3082f = new h(kVar.a(), new n3(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(c3.c r11, android.view.ScrollCaptureSession r12, s3.k r13, vi.c r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.c.a(c3.c, android.view.ScrollCaptureSession, s3.k, vi.c):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        b0.w(this.f3081e, o1.f13607b, new h0(this, runnable, null, 5), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        s1 s1VarW = b0.w(this.f3081e, null, new q(this, scrollCaptureSession, rect, consumer, null, 3), 3);
        s1VarW.T(new e(cancellationSignal, 0));
        cancellationSignal.setOnCancelListener(new d(s1VarW, 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(e0.B(this.f3078b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f3082f.f3092b = 0.0f;
        ((j1) this.f3079c.f449b).setValue(Boolean.TRUE);
        runnable.run();
    }
}
