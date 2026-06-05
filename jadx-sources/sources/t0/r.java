package t0;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import c2.e0;
import g3.j0;
import g3.m0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k0.k0;
import k0.s1;
import k0.t0;
import l3.s;
import l3.t;
import v0.u0;
import w2.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final p7.k f15397a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15398b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f15399c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f15400d;

    /* renamed from: e, reason: collision with root package name */
    public final h2 f15401e;

    /* renamed from: f, reason: collision with root package name */
    public int f15402f;

    /* renamed from: g, reason: collision with root package name */
    public t f15403g;

    /* renamed from: h, reason: collision with root package name */
    public int f15404h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15405i;
    public final ArrayList j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f15406k = true;

    public r(t tVar, p7.k kVar, boolean z2, t0 t0Var, u0 u0Var, h2 h2Var) {
        this.f15397a = kVar;
        this.f15398b = z2;
        this.f15399c = t0Var;
        this.f15400d = u0Var;
        this.f15401e = h2Var;
        this.f15403g = tVar;
    }

    public final void a(l3.g gVar) {
        this.f15402f++;
        try {
            this.j.add(gVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i10 = this.f15402f - 1;
        this.f15402f = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((q) this.f15397a.f12813b).f15387c.invoke(qi.l.T0(arrayList));
                arrayList.clear();
            }
        }
        return this.f15402f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z2 = this.f15406k;
        if (!z2) {
            return z2;
        }
        this.f15402f++;
        return true;
    }

    public final void c(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        boolean z2 = this.f15406k;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f15402f = 0;
        this.f15406k = false;
        ArrayList arrayList = ((q) this.f15397a.f12813b).j;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (fj.l.b(((WeakReference) arrayList.get(i10)).get(), this)) {
                arrayList.remove(i10);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z2 = this.f15406k;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z2 = this.f15406k;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z2 = this.f15406k;
        return z2 ? this.f15398b : z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z2 = this.f15406k;
        if (z2) {
            a(new l3.a(String.valueOf(charSequence), i10));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z2 = this.f15406k;
        if (!z2) {
            return z2;
        }
        a(new l3.e(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z2 = this.f15406k;
        if (!z2) {
            return z2;
        }
        a(new l3.f(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z2 = this.f15406k;
        if (!z2) {
            return z2;
        }
        a(new l3.h());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        t tVar = this.f15403g;
        return TextUtils.getCapsMode(tVar.f9937a.f7081b, m0.f(tVar.f9938b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z2 = (i10 & 1) != 0;
        this.f15405i = z2;
        if (z2) {
            this.f15404h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return m.d(this.f15403g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        if (m0.c(this.f15403g.f9938b)) {
            return null;
        }
        return mk.b.t(this.f15403g).f7081b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return mk.b.u(this.f15403g, i10).f7081b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return mk.b.v(this.f15403g, i10).f7081b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        boolean z2 = this.f15406k;
        if (z2) {
            z2 = false;
            switch (i10) {
                case R.id.selectAll:
                    a(new s(0, this.f15403g.f9937a.f7081b.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        int i11;
        boolean z2 = this.f15406k;
        if (z2) {
            z2 = true;
            if (i10 != 0) {
                switch (i10) {
                    case 2:
                        i11 = 2;
                        break;
                    case 3:
                        i11 = 3;
                        break;
                    case 4:
                        i11 = 4;
                        break;
                    case 5:
                        i11 = 6;
                        break;
                    case 6:
                        i11 = 7;
                        break;
                    case 7:
                        i11 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                        i11 = 1;
                        break;
                }
                ((q) this.f15397a.f12813b).f15388d.invoke(new l3.i(i11));
            } else {
                i11 = 1;
                ((q) this.f15397a.f12813b).f15388d.invoke(new l3.i(i11));
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02cc  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture r22, java.util.concurrent.Executor r23, java.util.function.IntConsumer r24) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.r.performHandwritingGesture(android.view.inputmethod.HandwritingGesture, java.util.concurrent.Executor, java.util.function.IntConsumer):void");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z2 = this.f15406k;
        if (z2) {
            return true;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        t0 t0Var;
        g3.f fVar;
        j0 j0Var;
        if (Build.VERSION.SDK_INT >= 34 && (t0Var = this.f15399c) != null && (fVar = t0Var.j) != null) {
            s1 s1VarD = t0Var.d();
            if (fVar.equals((s1VarD == null || (j0Var = s1VarD.f9254a.f7128a) == null) ? null : j0Var.f7117a)) {
                boolean zT = q6.e.t(previewableHandwritingGesture);
                u0 u0Var = this.f15400d;
                if (zT) {
                    SelectGesture selectGestureM = q6.e.m(previewableHandwritingGesture);
                    if (u0Var != null) {
                        long jI = m.i(t0Var, e0.G(selectGestureM.getSelectionArea()), selectGestureM.getGranularity() != 1 ? 0 : 1);
                        t0 t0Var2 = u0Var.f17489d;
                        if (t0Var2 != null) {
                            t0Var2.f(jI);
                        }
                        t0 t0Var3 = u0Var.f17489d;
                        if (t0Var3 != null) {
                            t0Var3.e(m0.f7143b);
                        }
                        if (!m0.c(jI)) {
                            u0Var.t(false);
                            u0Var.q(k0.f9150a);
                        }
                    }
                } else if (h.B(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureL = h.l(previewableHandwritingGesture);
                    if (u0Var != null) {
                        long jI2 = m.i(t0Var, e0.G(deleteGestureL.getDeletionArea()), deleteGestureL.getGranularity() != 1 ? 0 : 1);
                        t0 t0Var4 = u0Var.f17489d;
                        if (t0Var4 != null) {
                            t0Var4.e(jI2);
                        }
                        t0 t0Var5 = u0Var.f17489d;
                        if (t0Var5 != null) {
                            t0Var5.f(m0.f7143b);
                        }
                        if (!m0.c(jI2)) {
                            u0Var.t(false);
                            u0Var.q(k0.f9150a);
                        }
                    }
                } else if (h.C(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureP = h.p(previewableHandwritingGesture);
                    if (u0Var != null) {
                        long jB = m.b(t0Var, e0.G(selectRangeGestureP.getSelectionStartArea()), e0.G(selectRangeGestureP.getSelectionEndArea()), selectRangeGestureP.getGranularity() != 1 ? 0 : 1);
                        t0 t0Var6 = u0Var.f17489d;
                        if (t0Var6 != null) {
                            t0Var6.f(jB);
                        }
                        t0 t0Var7 = u0Var.f17489d;
                        if (t0Var7 != null) {
                            t0Var7.e(m0.f7143b);
                        }
                        if (!m0.c(jB)) {
                            u0Var.t(false);
                            u0Var.q(k0.f9150a);
                        }
                    }
                } else if (h.D(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureM = h.m(previewableHandwritingGesture);
                    if (u0Var != null) {
                        long jB2 = m.b(t0Var, e0.G(deleteRangeGestureM.getDeletionStartArea()), e0.G(deleteRangeGestureM.getDeletionEndArea()), deleteRangeGestureM.getGranularity() != 1 ? 0 : 1);
                        t0 t0Var8 = u0Var.f17489d;
                        if (t0Var8 != null) {
                            t0Var8.e(jB2);
                        }
                        t0 t0Var9 = u0Var.f17489d;
                        if (t0Var9 != null) {
                            t0Var9.f(m0.f7143b);
                        }
                        if (!m0.c(jB2)) {
                            u0Var.t(false);
                            u0Var.q(k0.f9150a);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new c3.d(u0Var, 1));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z2) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.f15406k
            if (r0 == 0) goto L77
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            p7.k r4 = r9.f15397a
            java.lang.Object r4 = r4.f12813b
            t0.q r4 = (t0.q) r4
            t0.n r4 = r4.f15396m
            java.lang.Object r7 = r4.f15370c
            monitor-enter(r7)
            r4.f15373f = r5     // Catch: java.lang.Throwable -> L6f
            r4.f15374g = r6     // Catch: java.lang.Throwable -> L6f
            r4.f15375h = r1     // Catch: java.lang.Throwable -> L6f
            r4.f15376i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r4.f15372e = r2     // Catch: java.lang.Throwable -> L6f
            l3.t r10 = r4.j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r4.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r10 = move-exception
            goto L75
        L71:
            r4.f15371d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            return r2
        L75:
            monitor-exit(r7)
            throw r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.r.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, pi.e] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f15406k;
        if (!z2) {
            return z2;
        }
        ((BaseInputConnection) ((q) this.f15397a.f12813b).f15394k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z2 = this.f15406k;
        if (z2) {
            a(new l3.q(i10, i11));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z2 = this.f15406k;
        if (z2) {
            a(new l3.r(String.valueOf(charSequence), i10));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        boolean z2 = this.f15406k;
        if (!z2) {
            return z2;
        }
        a(new s(i10, i11));
        return true;
    }
}
