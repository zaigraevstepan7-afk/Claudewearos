package ef;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public float f6059a;

    /* renamed from: b, reason: collision with root package name */
    public float f6060b;

    /* renamed from: c, reason: collision with root package name */
    public float f6061c;

    /* renamed from: d, reason: collision with root package name */
    public float f6062d;

    /* renamed from: e, reason: collision with root package name */
    public float f6063e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6064f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6065g = new ArrayList();

    public w() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10) {
        float f11 = this.f6062d;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f6060b;
        float f14 = this.f6061c;
        s sVar = new s(f13, f14, f13, f14);
        sVar.f6052f = this.f6062d;
        sVar.f6053g = f12;
        this.f6065g.add(new q(sVar));
        this.f6062d = f10;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f6064f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((u) arrayList.get(i10)).a(matrix, path);
        }
    }

    public final void c(float f10, float f11) {
        t tVar = new t();
        tVar.f6054b = f10;
        tVar.f6055c = f11;
        this.f6064f.add(tVar);
        r rVar = new r(tVar, this.f6060b, this.f6061c);
        float fB = rVar.b() + 270.0f;
        float fB2 = rVar.b() + 270.0f;
        a(fB);
        this.f6065g.add(rVar);
        this.f6062d = fB2;
        this.f6060b = f10;
        this.f6061c = f11;
    }

    public final void d(float f10, float f11, float f12) {
        this.f6059a = f10;
        this.f6060b = 0.0f;
        this.f6061c = f10;
        this.f6062d = f11;
        this.f6063e = (f11 + f12) % 360.0f;
        this.f6064f.clear();
        this.f6065g.clear();
    }
}
