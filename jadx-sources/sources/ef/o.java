package ef;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final w[] f6030a = new w[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f6031b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f6032c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f6033d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f6034e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f6035f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final w f6036g = new w();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f6037h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f6038i = new float[2];
    public final Path j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f6039k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6040l = true;

    public o() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f6030a[i10] = new w();
            this.f6031b[i10] = new Matrix();
            this.f6032c[i10] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(m mVar, float[] fArr, float f10, RectF rectF, p7.k kVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i10;
        w[] wVarArr;
        Matrix[] matrixArr2;
        boolean z2;
        float f11;
        boolean z10;
        int i11;
        path.rewind();
        Path path2 = this.f6034e;
        path2.rewind();
        Path path3 = this.f6035f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i12 = 0;
        while (true) {
            matrixArr = this.f6032c;
            fArr2 = this.f6037h;
            wVarArr = this.f6030a;
            matrixArr2 = this.f6031b;
            z2 = 0;
            if (i12 >= 4) {
                break;
            }
            d cVar = fArr == null ? i12 != 1 ? i12 != 2 ? i12 != 3 ? mVar.f6023f : mVar.f6022e : mVar.f6025h : mVar.f6024g : new c(fArr[i12]);
            a.a aVar = i12 != 1 ? i12 != 2 ? i12 != 3 ? mVar.f6019b : mVar.f6018a : mVar.f6021d : mVar.f6020c;
            w wVar = wVarArr[i12];
            aVar.getClass();
            aVar.B(wVar, f10, cVar.a(rectF));
            int i13 = i12 + 1;
            float f12 = (i13 % 4) * 90;
            matrixArr2[i12].reset();
            PointF pointF = this.f6033d;
            if (i12 == 1) {
                i11 = i12;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i12 == 2) {
                i11 = i12;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i12 != 3) {
                i11 = i12;
                pointF.set(rectF.right, rectF.top);
            } else {
                i11 = i12;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f12);
            w wVar2 = wVarArr[i11];
            fArr2[0] = wVar2.f6060b;
            fArr2[1] = wVar2.f6061c;
            matrixArr2[i11].mapPoints(fArr2);
            matrixArr[i11].reset();
            matrixArr[i11].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i11].preRotate(f12);
            i12 = i13;
        }
        int i14 = 0;
        for (i10 = 4; i14 < i10; i10 = 4) {
            w wVar3 = wVarArr[i14];
            wVar3.getClass();
            fArr2[z2] = 0.0f;
            fArr2[1] = wVar3.f6059a;
            matrixArr2[i14].mapPoints(fArr2);
            if (i14 == 0) {
                path.moveTo(fArr2[z2], fArr2[1]);
            } else {
                path.lineTo(fArr2[z2], fArr2[1]);
            }
            wVarArr[i14].b(matrixArr2[i14], path);
            if (kVar != null) {
                w wVar4 = wVarArr[i14];
                Matrix matrix = matrixArr2[i14];
                i iVar = (i) kVar.f12813b;
                f11 = 0.0f;
                BitSet bitSet = iVar.f6003e;
                wVar4.getClass();
                bitSet.set(i14, z2);
                v[] vVarArr = iVar.f6001c;
                wVar4.a(wVar4.f6063e);
                vVarArr[i14] = new p(new ArrayList(wVar4.f6065g), new Matrix(matrix));
            } else {
                f11 = 0.0f;
            }
            int i15 = i14 + 1;
            int i16 = i15 % 4;
            w wVar5 = wVarArr[i14];
            fArr2[0] = wVar5.f6060b;
            fArr2[1] = wVar5.f6061c;
            matrixArr2[i14].mapPoints(fArr2);
            w wVar6 = wVarArr[i16];
            wVar6.getClass();
            float[] fArr3 = this.f6038i;
            fArr3[0] = f11;
            fArr3[1] = wVar6.f6059a;
            matrixArr2[i16].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            w[] wVarArr2 = wVarArr;
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f11);
            w wVar7 = wVarArr2[i14];
            fArr2[0] = wVar7.f6060b;
            fArr2[1] = wVar7.f6061c;
            matrixArr2[i14].mapPoints(fArr2);
            if (i14 == 1 || i14 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            w wVar8 = this.f6036g;
            wVar8.d(0.0f, 270.0f, 0.0f);
            (i14 != 1 ? i14 != 2 ? i14 != 3 ? mVar.j : mVar.f6026i : mVar.f6028l : mVar.f6027k).getClass();
            wVar8.c(fMax, 0.0f);
            Path path4 = this.j;
            path4.reset();
            wVar8.b(matrixArr3[i14], path4);
            if (this.f6040l && (b(path4, i14) || b(path4, i16))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = wVar8.f6059a;
                matrixArr3[i14].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                wVar8.b(matrixArr3[i14], path2);
            } else {
                wVar8.b(matrixArr3[i14], path);
            }
            if (kVar != null) {
                Matrix matrix2 = matrixArr3[i14];
                i iVar2 = (i) kVar.f12813b;
                z10 = false;
                iVar2.f6003e.set(i14 + 4, false);
                v[] vVarArr2 = iVar2.f6002d;
                wVar8.a(wVar8.f6063e);
                vVarArr2[i14] = new p(new ArrayList(wVar8.f6065g), new Matrix(matrix2));
            } else {
                z10 = false;
            }
            matrixArr = matrixArr3;
            i14 = i15;
            z2 = z10;
            wVarArr = wVarArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i10) {
        Path path2 = this.f6039k;
        path2.reset();
        this.f6030a[i10].b(this.f6031b[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
