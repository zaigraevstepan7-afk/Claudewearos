package mi;

import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.Type;
import androidx.lifecycle.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final RenderScript f11745a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11746b;

    /* renamed from: c, reason: collision with root package name */
    public final ScriptIntrinsicBlur f11747c;

    /* renamed from: d, reason: collision with root package name */
    public final Allocation f11748d;

    /* renamed from: e, reason: collision with root package name */
    public final Allocation f11749e;

    /* renamed from: f, reason: collision with root package name */
    public final Bitmap f11750f;

    /* renamed from: g, reason: collision with root package name */
    public final sj.c f11751g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11752h;

    public d0(RenderScript renderScript, long j) {
        fj.l.f(renderScript, "rs");
        this.f11745a = renderScript;
        this.f11746b = j;
        this.f11751g = u6.v.a(-1, 6, null);
        int i10 = (int) (j >> 32);
        int i11 = (i10 % 4) + i10;
        int i12 = (int) (j & 4294967295L);
        int i13 = (i12 % 4) + i12;
        Allocation allocationCreateTyped = Allocation.createTyped(renderScript, new Type.Builder(renderScript, Element.U8_4(renderScript)).setX(i11).setY(i13).create(), 33);
        fj.l.e(allocationCreateTyped, "createTyped(...)");
        this.f11748d = allocationCreateTyped;
        allocationCreateTyped.setOnBufferAvailableListener(new Allocation.OnBufferAvailableListener() { // from class: mi.c0
            @Override // android.renderscript.Allocation.OnBufferAvailableListener
            public final void onBufferAvailable(Allocation allocation) {
                d0 d0Var = this.f11744a;
                if (d0Var.f11752h) {
                    return;
                }
                allocation.ioReceive();
                sj.c cVar = d0Var.f11751g;
                Object objH = cVar.h(pi.o.f13011a);
                if (!(objH instanceof sj.i)) {
                    return;
                }
                Object obj = ((sj.j) qj.b0.A(ti.i.f16336a, new h0(cVar, (ti.c) null, 28))).f15076a;
            }
        });
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i13, Bitmap.Config.ARGB_8888);
        this.f11750f = bitmapCreateBitmap;
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScript, bitmapCreateBitmap);
        fj.l.e(allocationCreateFromBitmap, "createFromBitmap(...)");
        this.f11749e = allocationCreateFromBitmap;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        fj.l.e(scriptIntrinsicBlurCreate, "create(...)");
        this.f11747c = scriptIntrinsicBlurCreate;
        scriptIntrinsicBlurCreate.setInput(allocationCreateTyped);
    }
}
