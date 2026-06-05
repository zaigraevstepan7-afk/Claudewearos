package pc;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import qc.l0;
import qc.p;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12839a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12840b;

    public h(Context context) {
        this.f12840b = context;
    }

    @Override // qc.p
    public final void zza() {
        BitmapDrawable bitmapDrawable;
        boolean zB = false;
        switch (this.f12839a) {
            case 0:
                i iVar = (i) this.f12840b;
                Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) mc.n.D.f11597x.f449b).get(Integer.valueOf(iVar.f12842b.H.f11565f));
                if (bitmap != null) {
                    mc.j jVar = iVar.f12842b.H;
                    boolean z2 = jVar.f11563d;
                    float f10 = jVar.f11564e;
                    Activity activity = iVar.f12841a;
                    if (!z2 || f10 <= 0.0f || f10 > 25.0f) {
                        bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                    } else {
                        try {
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                            RenderScript renderScriptCreate = RenderScript.create(activity);
                            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                            scriptIntrinsicBlurCreate.setRadius(f10);
                            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                        } catch (RuntimeException unused) {
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                        }
                    }
                    r0.f13445l.post(new a8.e(14, this, bitmapDrawable, zB));
                    return;
                }
                return;
            default:
                try {
                    zB = kc.b.b((Context) this.f12840b);
                } catch (IOException | IllegalStateException | nd.g | nd.h e10) {
                    int i10 = l0.f13401b;
                    rc.k.e("Fail to get isAdIdFakeForDebugLogging", e10);
                }
                synchronized (rc.h.f14340b) {
                    rc.h.f14341c = true;
                    rc.h.f14342d = zB;
                }
                String str = "Update ad debug logging enablement as " + zB;
                int i11 = l0.f13401b;
                rc.k.g(str);
                return;
        }
    }

    public /* synthetic */ h(i iVar) {
        this.f12840b = iVar;
    }
}
