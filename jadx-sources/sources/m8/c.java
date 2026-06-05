package m8;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;
import k8.o;
import r8.i;
import r8.n;
import u0.l;
import u6.v;
import v8.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11421a;

    /* renamed from: b, reason: collision with root package name */
    public final n f11422b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11423c;

    public /* synthetic */ c(Object obj, n nVar, int i10) {
        this.f11421a = i10;
        this.f11423c = obj;
        this.f11422b = nVar;
    }

    @Override // m8.f
    public final Object a() {
        int i10 = this.f11421a;
        Object obj = this.f11423c;
        n nVar = this.f11422b;
        switch (i10) {
            case 0:
                return new g(h8.n.c(new BitmapDrawable(nVar.f13901a.getResources(), (Bitmap) obj)), false, k8.h.f9473b);
            case 1:
                kk.f fVar = new kk.f();
                fVar.m6write((byte[]) obj);
                return new h(new o(fVar, nVar.f13906f, null), null, k8.h.f9473b);
            case 2:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new h(new o(v.j(new d(byteBuffer)), nVar.f13906f, new k8.f(byteBuffer)), null, k8.h.f9473b);
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = m.f17898a;
                boolean z2 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof m7.a);
                if (z2) {
                    bitmapDrawable = new BitmapDrawable(nVar.f13901a.getResources(), l.c(bitmapDrawable, i.a(nVar), nVar.f13902b, nVar.f13903c, nVar.f13904d == s8.d.f14781b));
                }
                return new g(h8.n.c(bitmapDrawable), z2, k8.h.f9473b);
        }
    }
}
