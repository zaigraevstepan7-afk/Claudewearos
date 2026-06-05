package w2;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f18201a = new b0();

    public final boolean onClearTranslation(View view) {
        ej.a aVar;
        fj.l.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        x1.e contentCaptureManager$ui = ((t) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f19794f = x1.a.f19781a;
        q.k kVarF = contentCaptureManager$ui.f();
        Object[] objArr = kVarF.f13098c;
        long[] jArr = kVarF.f13096a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        q.g0 g0Var = ((d3.s) objArr[(i10 << 3) + i12]).f4769a.f4766d.f4758a;
                        Object objG = g0Var.g(d3.v.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = g0Var.g(d3.m.f4745n);
                            d3.a aVar2 = (d3.a) (objG2 != null ? objG2 : null);
                            if (aVar2 != null && (aVar = (ej.a) aVar2.f4704b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean onHideTranslation(View view) {
        ej.c cVar;
        fj.l.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        x1.e contentCaptureManager$ui = ((t) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f19794f = x1.a.f19781a;
        q.k kVarF = contentCaptureManager$ui.f();
        Object[] objArr = kVarF.f13098c;
        long[] jArr = kVarF.f13096a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        q.g0 g0Var = ((d3.s) objArr[(i10 << 3) + i12]).f4769a.f4766d.f4758a;
                        Object objG = g0Var.g(d3.v.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (fj.l.b(objG, Boolean.TRUE)) {
                            Object objG2 = g0Var.g(d3.m.f4744m);
                            d3.a aVar = (d3.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (cVar = (ej.c) aVar.f4704b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean onShowTranslation(View view) {
        ej.c cVar;
        fj.l.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        x1.e contentCaptureManager$ui = ((t) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f19794f = x1.a.f19782b;
        q.k kVarF = contentCaptureManager$ui.f();
        Object[] objArr = kVarF.f13098c;
        long[] jArr = kVarF.f13096a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        q.g0 g0Var = ((d3.s) objArr[(i10 << 3) + i12]).f4769a.f4766d.f4758a;
                        Object objG = g0Var.g(d3.v.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (fj.l.b(objG, Boolean.FALSE)) {
                            Object objG2 = g0Var.g(d3.m.f4744m);
                            d3.a aVar = (d3.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (cVar = (ej.c) aVar.f4704b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }
}
