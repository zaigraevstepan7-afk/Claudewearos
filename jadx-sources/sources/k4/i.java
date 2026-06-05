package k4;

import android.graphics.Matrix;
import android.view.View;
import c2.e0;
import c2.k0;
import java.util.ArrayList;
import w2.f0;
import w2.t0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f9433a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f9434b;

    public i(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f9434b = new int[size];
        this.f9433a = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            this.f9434b[i10] = ((Integer) arrayList.get(i10)).intValue();
            this.f9433a[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    @Override // w2.t0
    public void a(View view, float[] fArr) {
        k0.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z2 = parent instanceof View;
        float[] fArr2 = this.f9433a;
        if (z2) {
            b((View) parent, fArr);
            k0.d(fArr2);
            k0.f(fArr2, -view.getScrollX(), -view.getScrollY());
            f0.r(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            k0.d(fArr2);
            k0.f(fArr2, left, top);
            f0.r(fArr, fArr2);
        } else {
            int[] iArr = this.f9434b;
            view.getLocationInWindow(iArr);
            k0.d(fArr2);
            k0.f(fArr2, -view.getScrollX(), -view.getScrollY());
            f0.r(fArr, fArr2);
            float f10 = iArr[0];
            float f11 = iArr[1];
            k0.d(fArr2);
            k0.f(fArr2, f10, f11);
            f0.r(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        e0.y(matrix, fArr2);
        f0.r(fArr, fArr2);
    }

    public i(int i10, int i11) {
        this.f9434b = new int[]{i10, i11};
        this.f9433a = new float[]{0.0f, 1.0f};
    }

    public i(int i10, int i11, int i12) {
        this.f9434b = new int[]{i10, i11, i12};
        this.f9433a = new float[]{0.0f, 0.5f, 1.0f};
    }

    public i(float[] fArr) {
        this.f9433a = fArr;
        this.f9434b = new int[2];
    }
}
