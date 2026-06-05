package wc;

import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbgr;
import fc.n;
import nc.o;
import nc.p;
import nc.s;
import nc.t;
import nc.z2;
import w5.a0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f19275a;

    /* renamed from: b, reason: collision with root package name */
    public final zzbgr f19276b;

    public i(Context context) {
        zzbgr zzbgrVar;
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f19275a = frameLayout;
        if (isInEditMode()) {
            zzbgrVar = null;
        } else {
            p pVar = s.f12202f.f12204b;
            Context context2 = frameLayout.getContext();
            pVar.getClass();
            zzbgrVar = (zzbgr) new o(pVar, this, frameLayout, context2).d(context2, false);
        }
        this.f19276b = zzbgrVar;
    }

    public static void b(i iVar, n nVar) {
        zzbgr zzbgrVar = iVar.f19276b;
        if (zzbgrVar == null) {
            return;
        }
        try {
            if (nVar instanceof z2) {
                zzbgrVar.zzdz(((z2) nVar).f12262a);
            } else if (nVar == null) {
                zzbgrVar.zzdz(null);
            } else {
                rc.k.b("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e10) {
            rc.k.e("Unable to call setMediaContent on delegate", e10);
        }
    }

    public final View a(String str) {
        zzbgr zzbgrVar = this.f19276b;
        if (zzbgrVar != null) {
            try {
                xd.a aVarZzb = zzbgrVar.zzb(str);
                if (aVarZzb != null) {
                    return (View) xd.b.u(aVarZzb);
                }
            } catch (RemoteException e10) {
                rc.k.e("Unable to call getAssetView on delegate", e10);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront(this.f19275a);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f19275a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final void c(String str, View view) {
        zzbgr zzbgrVar = this.f19276b;
        if (zzbgrVar == null) {
            return;
        }
        try {
            zzbgrVar.zzdx(str, new xd.b(view));
        } catch (RemoteException e10) {
            rc.k.e("Unable to call setAssetView on delegate", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzbgr zzbgrVar = this.f19276b;
        if (zzbgrVar != null) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlM)).booleanValue()) {
                try {
                    zzbgrVar.zzd(new xd.b(motionEvent));
                } catch (RemoteException e10) {
                    rc.k.e("Unable to call handleTouchEvent on delegate", e10);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
        a("3011");
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final b getMediaView() {
        View viewA = a("3010");
        if (viewA instanceof b) {
            return (b) viewA;
        }
        if (viewA == null) {
            return null;
        }
        rc.k.b("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        zzbgr zzbgrVar = this.f19276b;
        if (zzbgrVar == null) {
            return;
        }
        try {
            zzbgrVar.zze(new xd.b(view), i10);
        } catch (RemoteException e10) {
            rc.k.e("Unable to call onVisibilityChanged on delegate", e10);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f19275a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f19275a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(a aVar) {
        c("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        c("3005", view);
    }

    public final void setBodyView(View view) {
        c("3004", view);
    }

    public final void setCallToActionView(View view) {
        c("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        zzbgr zzbgrVar = this.f19276b;
        if (zzbgrVar == null) {
            return;
        }
        try {
            zzbgrVar.zzdy(new xd.b(view));
        } catch (RemoteException e10) {
            rc.k.e("Unable to call setClickConfirmingView on delegate", e10);
        }
    }

    public final void setHeadlineView(View view) {
        c("3001", view);
    }

    public final void setIconView(View view) {
        c("3003", view);
    }

    public final void setImageView(View view) {
        c("3008", view);
    }

    public final void setMediaView(b bVar) {
        c("3010", bVar);
        if (bVar == null) {
            return;
        }
        w8.h hVar = new w8.h(this);
        synchronized (bVar) {
            bVar.f19255e = hVar;
            if (bVar.f19252b) {
                b(this, bVar.f19251a);
            }
        }
        a0 a0Var = new a0(this);
        synchronized (bVar) {
            bVar.f19256f = a0Var;
            if (bVar.f19254d) {
                ImageView.ScaleType scaleType = bVar.f19253c;
                zzbgr zzbgrVar = this.f19276b;
                if (zzbgrVar != null && scaleType != null) {
                    try {
                        zzbgrVar.zzdA(new xd.b(scaleType));
                    } catch (RemoteException e10) {
                        rc.k.e("Unable to call setMediaViewImageScaleType on delegate", e10);
                    }
                }
            }
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        zzbgr zzbgrVar = this.f19276b;
        if (zzbgrVar == null) {
            return;
        }
        try {
            zzbgrVar.zzdB((xd.a) nativeAd.zza());
        } catch (RemoteException e10) {
            rc.k.e("Unable to call setNativeAd on delegate", e10);
        }
    }

    public final void setPriceView(View view) {
        c("3007", view);
    }

    public final void setStarRatingView(View view) {
        c("3009", view);
    }

    public final void setStoreView(View view) {
        c("3006", view);
    }
}
