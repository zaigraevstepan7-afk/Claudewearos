package l7;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a0 extends z {
    @Override // hj.a
    public final void M(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // l7.z, hj.a
    public final void N(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // l7.z
    public final void e0(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // l7.z
    public final void f0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // l7.z
    public final void g0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // hj.a
    public final float y(View view) {
        return view.getTransitionAlpha();
    }
}
