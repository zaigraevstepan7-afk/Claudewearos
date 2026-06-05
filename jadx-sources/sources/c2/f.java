package c2;

import android.content.Context;
import android.os.Build;
import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements b0 {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2990f = true;

    /* renamed from: a, reason: collision with root package name */
    public final w2.t f2991a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2992b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public g2.b f2993c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2994d;

    /* renamed from: e, reason: collision with root package name */
    public final d f2995e;

    public f(w2.t tVar) {
        this.f2991a = tVar;
        d dVar = new d(this, 0);
        this.f2995e = dVar;
        if (tVar.isAttachedToWindow()) {
            Context context = tVar.getContext();
            if (!this.f2994d) {
                context.getApplicationContext().registerComponentCallbacks(dVar);
                this.f2994d = true;
            }
        }
        tVar.addOnAttachStateChangeListener(new e(this, 0));
    }

    @Override // c2.b0
    public final void a(f2.b bVar) {
        synchronized (this.f2992b) {
            if (!bVar.f6531s) {
                bVar.f6531s = true;
                bVar.b();
            }
        }
    }

    @Override // c2.b0
    public final f2.b b() {
        f2.d iVar;
        f2.b bVar;
        synchronized (this.f2992b) {
            try {
                w2.t tVar = this.f2991a;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    tVar.getUniqueDrawingId();
                }
                if (i10 >= 29) {
                    iVar = new f2.g();
                } else if (f2990f) {
                    try {
                        iVar = new f2.e(this.f2991a, new v(), new e2.b());
                    } catch (Throwable unused) {
                        f2990f = false;
                        iVar = new f2.i(c(this.f2991a));
                    }
                } else {
                    iVar = new f2.i(c(this.f2991a));
                }
                bVar = new f2.b(iVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public final g2.a c(w2.t tVar) {
        g2.b bVar = this.f2993c;
        if (bVar != null) {
            return bVar;
        }
        g2.b bVar2 = new g2.b(tVar.getContext());
        bVar2.setClipChildren(false);
        bVar2.setClipToPadding(false);
        bVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        tVar.addView(bVar2, -1);
        this.f2993c = bVar2;
        return bVar2;
    }
}
