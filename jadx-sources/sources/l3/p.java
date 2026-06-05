package l3;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import g3.m0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final d8.e f9923a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9924b;

    /* renamed from: c, reason: collision with root package name */
    public int f9925c;

    /* renamed from: d, reason: collision with root package name */
    public t f9926d;

    /* renamed from: e, reason: collision with root package name */
    public int f9927e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9928f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f9929g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f9930h = true;

    public p(t tVar, d8.e eVar, boolean z2) {
        this.f9923a = eVar;
        this.f9924b = z2;
        this.f9926d = tVar;
    }

    public final void a(g gVar) {
        this.f9925c++;
        try {
            this.f9929g.add(gVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i10 = this.f9925c - 1;
        this.f9925c = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f9929g;
            if (!arrayList.isEmpty()) {
                ((w) this.f9923a.f5001a).f9951e.invoke(qi.l.T0(arrayList));
                arrayList.clear();
            }
        }
        return this.f9925c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z2 = this.f9930h;
        if (!z2) {
            return z2;
        }
        this.f9925c++;
        return true;
    }

    public final void c(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        boolean z2 = this.f9930h;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f9929g.clear();
        this.f9925c = 0;
        this.f9930h = false;
        ArrayList arrayList = ((w) this.f9923a.f5001a).f9955i;
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
        boolean z2 = this.f9930h;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z2 = this.f9930h;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z2 = this.f9930h;
        return z2 ? this.f9924b : z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z2 = this.f9930h;
        if (z2) {
            a(new a(String.valueOf(charSequence), i10));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z2 = this.f9930h;
        if (!z2) {
            return z2;
        }
        a(new e(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z2 = this.f9930h;
        if (!z2) {
            return z2;
        }
        a(new f(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z2 = this.f9930h;
        if (!z2) {
            return z2;
        }
        a(new h());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        t tVar = this.f9926d;
        return TextUtils.getCapsMode(tVar.f9937a.f7081b, m0.f(tVar.f9938b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z2 = (i10 & 1) != 0;
        this.f9928f = z2;
        if (z2) {
            this.f9927e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return a.a.Y(this.f9926d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        if (m0.c(this.f9926d.f9938b)) {
            return null;
        }
        return mk.b.t(this.f9926d).f7081b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return mk.b.u(this.f9926d, i10).f7081b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return mk.b.v(this.f9926d, i10).f7081b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        boolean z2 = this.f9930h;
        if (z2) {
            z2 = false;
            switch (i10) {
                case R.id.selectAll:
                    a(new s(0, this.f9926d.f9937a.f7081b.length()));
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
        boolean z2 = this.f9930h;
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
                ((w) this.f9923a.f5001a).f9952f.invoke(new i(i11));
            } else {
                i11 = 1;
                ((w) this.f9923a.f5001a).f9952f.invoke(new i(i11));
            }
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z2 = this.f9930h;
        if (z2) {
            return true;
        }
        return z2;
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
            boolean r0 = r9.f9930h
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
            d8.e r4 = r9.f9923a
            java.lang.Object r4 = r4.f5001a
            l3.w r4 = (l3.w) r4
            l3.c r4 = r4.f9957l
            java.lang.Object r7 = r4.f9893c
            monitor-enter(r7)
            r4.f9896f = r5     // Catch: java.lang.Throwable -> L6f
            r4.f9897g = r6     // Catch: java.lang.Throwable -> L6f
            r4.f9898h = r1     // Catch: java.lang.Throwable -> L6f
            r4.f9899i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r4.f9895e = r2     // Catch: java.lang.Throwable -> L6f
            l3.t r10 = r4.j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r4.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r10 = move-exception
            goto L75
        L71:
            r4.f9894d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            return r2
        L75:
            monitor-exit(r7)
            throw r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.p.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, pi.e] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f9930h;
        if (!z2) {
            return z2;
        }
        ((BaseInputConnection) ((w) this.f9923a.f5001a).j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z2 = this.f9930h;
        if (z2) {
            a(new q(i10, i11));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z2 = this.f9930h;
        if (z2) {
            a(new r(String.valueOf(charSequence), i10));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        boolean z2 = this.f9930h;
        if (!z2) {
            return z2;
        }
        a(new s(i10, i11));
        return true;
    }
}
