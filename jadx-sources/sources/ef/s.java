package ef;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class s extends u {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f6047h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f6048b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6049c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6050d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6051e;

    /* renamed from: f, reason: collision with root package name */
    public float f6052f;

    /* renamed from: g, reason: collision with root package name */
    public float f6053g;

    public s(float f10, float f11, float f12, float f13) {
        this.f6048b = f10;
        this.f6049c = f11;
        this.f6050d = f12;
        this.f6051e = f13;
    }

    @Override // ef.u
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f6056a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f10 = this.f6050d;
        float f11 = this.f6051e;
        RectF rectF = f6047h;
        rectF.set(this.f6048b, this.f6049c, f10, f11);
        path.arcTo(rectF, this.f6052f, this.f6053g, false);
        path.transform(matrix);
    }
}
