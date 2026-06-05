package c2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements u {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f2965a = c.f2968a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f2966b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f2967c;

    @Override // c2.u
    public final void a(j jVar, h hVar) {
        Canvas canvas = this.f2965a;
        if (!(jVar instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(jVar.f3006a, e0.p(hVar));
    }

    @Override // c2.u
    public final void b(float f10, float f11) {
        this.f2965a.scale(f10, f11);
    }

    @Override // c2.u
    public final void c(float f10) {
        this.f2965a.rotate(f10);
    }

    @Override // c2.u
    public final void e(g gVar, h hVar) {
        this.f2965a.drawBitmap(e0.j(gVar), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), e0.p(hVar));
    }

    @Override // c2.u
    public final void f() {
        this.f2965a.save();
    }

    @Override // c2.u
    public final void g() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.n(this.f2965a, false);
    }

    @Override // c2.u
    public final void h(float f10, long j, h hVar) {
        this.f2965a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f10, e0.p(hVar));
    }

    @Override // c2.u
    public final void i(float[] fArr) {
        if (e0.t(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        e0.x(matrix, fArr);
        this.f2965a.concat(matrix);
    }

    @Override // c2.u
    public final void j(b2.c cVar, h hVar) {
        this.f2965a.saveLayer(cVar.f1502a, cVar.f1503b, cVar.f1504c, cVar.f1505d, e0.p(hVar), 31);
    }

    @Override // c2.u
    public final void k(float f10, float f11, float f12, float f13, h hVar) {
        this.f2965a.drawRect(f10, f11, f12, f13, e0.p(hVar));
    }

    @Override // c2.u
    public final void l(float f10, float f11, float f12, float f13, float f14, float f15, h hVar) {
        this.f2965a.drawRoundRect(f10, f11, f12, f13, f14, f15, e0.p(hVar));
    }

    @Override // c2.u
    public final void m(j jVar) {
        Canvas canvas = this.f2965a;
        if (!(jVar instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(jVar.f3006a, Region.Op.INTERSECT);
    }

    @Override // c2.u
    public final void n(long j, long j4, h hVar) {
        this.f2965a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), e0.p(hVar));
    }

    @Override // c2.u
    public final void o(float f10, float f11, float f12, float f13, int i10) {
        this.f2965a.clipRect(f10, f11, f12, f13, i10 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // c2.u
    public final void p(float f10, float f11) {
        this.f2965a.translate(f10, f11);
    }

    @Override // c2.u
    public final void q() {
        this.f2965a.restore();
    }

    @Override // c2.u
    public final void r(float f10, float f11, float f12, float f13, float f14, float f15, h hVar) {
        this.f2965a.drawArc(f10, f11, f12, f13, f14, f15, false, e0.p(hVar));
    }

    @Override // c2.u
    public final void s(g gVar, long j, long j4, long j10, h hVar) {
        if (this.f2966b == null) {
            this.f2966b = new Rect();
            this.f2967c = new Rect();
        }
        Canvas canvas = this.f2965a;
        Bitmap bitmapJ = e0.j(gVar);
        Rect rect = this.f2966b;
        fj.l.c(rect);
        int i10 = (int) (j >> 32);
        rect.left = i10;
        int i11 = (int) (j & 4294967295L);
        rect.top = i11;
        rect.right = i10 + ((int) (j4 >> 32));
        rect.bottom = i11 + ((int) (j4 & 4294967295L));
        Rect rect2 = this.f2967c;
        fj.l.c(rect2);
        int i12 = (int) 0;
        rect2.left = i12;
        int i13 = (int) 0;
        rect2.top = i13;
        rect2.right = i12 + ((int) (j10 >> 32));
        rect2.bottom = i13 + ((int) (4294967295L & j10));
        canvas.drawBitmap(bitmapJ, rect, rect2, e0.p(hVar));
    }

    @Override // c2.u
    public final void t() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.n(this.f2965a, true);
    }
}
