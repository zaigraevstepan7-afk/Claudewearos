package c2;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f2999a;

    /* renamed from: b, reason: collision with root package name */
    public int f3000b = 3;

    /* renamed from: c, reason: collision with root package name */
    public Shader f3001c;

    /* renamed from: d, reason: collision with root package name */
    public n f3002d;

    public h(Paint paint) {
        this.f2999a = paint;
    }

    public final int a() {
        Paint.Cap strokeCap = this.f2999a.getStrokeCap();
        int i10 = strokeCap == null ? -1 : i.f3004a[strokeCap.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int b() {
        Paint.Join strokeJoin = this.f2999a.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : i.f3005b[strokeJoin.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void c(float f10) {
        this.f2999a.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public final void d(int i10) {
        if (this.f3000b == i10) {
            return;
        }
        this.f3000b = i10;
        int i11 = Build.VERSION.SDK_INT;
        Paint paint = this.f2999a;
        if (i11 >= 29) {
            paint.setBlendMode(e0.A(i10));
        } else {
            paint.setXfermode(new PorterDuffXfermode(e0.H(i10)));
        }
    }

    public final void e(long j) {
        this.f2999a.setColor(e0.E(j));
    }

    public final void f(n nVar) {
        this.f3002d = nVar;
        this.f2999a.setColorFilter(nVar != null ? nVar.f3019a : null);
    }

    public final void g(int i10) {
        this.f2999a.setFilterBitmap(!(i10 == 0));
    }

    public final void h(Shader shader) {
        this.f3001c = shader;
        this.f2999a.setShader(shader);
    }

    public final void i(int i10) {
        this.f2999a.setStrokeCap(i10 == 2 ? Paint.Cap.SQUARE : i10 == 1 ? Paint.Cap.ROUND : i10 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public final void j(int i10) {
        this.f2999a.setStrokeJoin(i10 == 0 ? Paint.Join.MITER : i10 == 2 ? Paint.Join.BEVEL : i10 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public final void k(float f10) {
        this.f2999a.setStrokeWidth(f10);
    }

    public final void l(int i10) {
        this.f2999a.setStyle(i10 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
