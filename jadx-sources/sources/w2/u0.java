package w2;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f18425a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f18426b = new int[2];

    @Override // w2.t0
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f18425a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f18426b;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i10, iArr[1] - i11);
        c2.e0.y(matrix, fArr);
    }
}
