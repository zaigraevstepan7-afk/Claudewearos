package c2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Path f3006a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f3007b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f3008c;

    /* renamed from: d, reason: collision with root package name */
    public Matrix f3009d;

    public j(Path path) {
        this.f3006a = path;
    }

    public static void a(j jVar, j jVar2) {
        Path path = jVar.f3006a;
        if (!(jVar2 instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(jVar2.f3006a, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
    }

    public static void b(j jVar, b2.c cVar) {
        o0 o0Var = o0.f3025a;
        jVar.getClass();
        float f10 = cVar.f1502a;
        float f11 = cVar.f1505d;
        float f12 = cVar.f1504c;
        float f13 = cVar.f1503b;
        if (Float.isNaN(f10) || Float.isNaN(f13) || Float.isNaN(f12) || Float.isNaN(f11)) {
            l.c("Invalid rectangle, make sure no value is NaN");
        }
        if (jVar.f3007b == null) {
            jVar.f3007b = new RectF();
        }
        RectF rectF = jVar.f3007b;
        fj.l.c(rectF);
        rectF.set(f10, f13, f12, f11);
        Path path = jVar.f3006a;
        RectF rectF2 = jVar.f3007b;
        fj.l.c(rectF2);
        path.addRect(rectF2, l.b(o0Var));
    }

    public static void c(j jVar, b2.d dVar) {
        o0 o0Var = o0.f3025a;
        if (jVar.f3007b == null) {
            jVar.f3007b = new RectF();
        }
        RectF rectF = jVar.f3007b;
        fj.l.c(rectF);
        float f10 = dVar.f1506a;
        long j = dVar.f1513h;
        long j4 = dVar.f1512g;
        long j10 = dVar.f1511f;
        long j11 = dVar.f1510e;
        rectF.set(f10, dVar.f1507b, dVar.f1508c, dVar.f1509d);
        if (jVar.f3008c == null) {
            jVar.f3008c = new float[8];
        }
        float[] fArr = jVar.f3008c;
        fj.l.c(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j11 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j11 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j10 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = jVar.f3006a;
        RectF rectF2 = jVar.f3007b;
        fj.l.c(rectF2);
        float[] fArr2 = jVar.f3008c;
        fj.l.c(fArr2);
        path.addRoundRect(rectF2, fArr2, l.b(o0Var));
    }

    public final void d() {
        this.f3006a.close();
    }

    public final void e(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f3006a.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    public final b2.c f() {
        if (this.f3007b == null) {
            this.f3007b = new RectF();
        }
        RectF rectF = this.f3007b;
        fj.l.c(rectF);
        this.f3006a.computeBounds(rectF, true);
        return new b2.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void g(float f10, float f11) {
        this.f3006a.lineTo(f10, f11);
    }

    public final void h(float f10, float f11) {
        this.f3006a.moveTo(f10, f11);
    }

    public final boolean i(j jVar, j jVar2, int i10) {
        Path.Op op = i10 == 0 ? Path.Op.DIFFERENCE : i10 == 1 ? Path.Op.INTERSECT : i10 == 4 ? Path.Op.REVERSE_DIFFERENCE : i10 == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(jVar instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = jVar.f3006a;
        if (jVar2 instanceof j) {
            return this.f3006a.op(path, jVar2.f3006a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void j() {
        this.f3006a.reset();
    }

    public final void k() {
        this.f3006a.rewind();
    }

    public final void l(long j) {
        Matrix matrix = this.f3009d;
        if (matrix == null) {
            this.f3009d = new Matrix();
        } else {
            fj.l.c(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f3009d;
        fj.l.c(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.f3009d;
        fj.l.c(matrix3);
        this.f3006a.transform(matrix3);
    }
}
