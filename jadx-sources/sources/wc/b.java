package wc;

import android.os.RemoteException;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.zzbgr;
import com.google.android.gms.internal.ads.zzbhh;
import fc.n;
import nc.z2;
import w5.a0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public n f19251a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19252b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView.ScaleType f19253c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19254d;

    /* renamed from: e, reason: collision with root package name */
    public w8.h f19255e;

    /* renamed from: f, reason: collision with root package name */
    public a0 f19256f;

    public n getMediaContent() {
        return this.f19251a;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        zzbgr zzbgrVar;
        this.f19254d = true;
        this.f19253c = scaleType;
        a0 a0Var = this.f19256f;
        if (a0Var == null || (zzbgrVar = ((i) a0Var.f18604a).f19276b) == null || scaleType == null) {
            return;
        }
        try {
            zzbgrVar.zzdA(new xd.b(scaleType));
        } catch (RemoteException e10) {
            rc.k.e("Unable to call setMediaViewImageScaleType on delegate", e10);
        }
    }

    public void setMediaContent(n nVar) {
        boolean zZzl;
        boolean zZzr;
        this.f19252b = true;
        this.f19251a = nVar;
        w8.h hVar = this.f19255e;
        if (hVar != null) {
            i.b((i) hVar.f18959a, nVar);
        }
        if (nVar == null) {
            return;
        }
        try {
            zzbhh zzbhhVar = ((z2) nVar).f12263b;
            if (zzbhhVar != null) {
                boolean zZzk = false;
                try {
                    zZzl = ((z2) nVar).f12262a.zzl();
                } catch (RemoteException e10) {
                    rc.k.e("", e10);
                    zZzl = false;
                }
                if (!zZzl) {
                    try {
                        zZzk = ((z2) nVar).f12262a.zzk();
                    } catch (RemoteException e11) {
                        rc.k.e("", e11);
                    }
                    if (zZzk) {
                        zZzr = zzbhhVar.zzr(new xd.b(this));
                    }
                    removeAllViews();
                }
                zZzr = zzbhhVar.zzs(new xd.b(this));
                if (zZzr) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e12) {
            removeAllViews();
            rc.k.e("", e12);
        }
    }
}
