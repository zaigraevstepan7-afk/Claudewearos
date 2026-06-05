package fc;

import android.content.Context;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbfa;
import nc.i2;
import nc.i3;
import nc.m0;
import nc.r2;
import nc.s2;
import nc.s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class k extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final s2 f6708a;

    public k(Context context) {
        super(context);
        this.f6708a = new s2(this);
    }

    public final void a() {
        zzbdc.zza(getContext());
        if (((Boolean) zzbfa.zze.zze()).booleanValue()) {
            if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzlr)).booleanValue()) {
                rc.c.f14330b.execute(new z(this, 1));
                return;
            }
        }
        s2 s2Var = this.f6708a;
        s2Var.getClass();
        try {
            m0 m0Var = s2Var.f12216i;
            if (m0Var != null) {
                m0Var.zzx();
            }
        } catch (RemoteException e10) {
            rc.k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void b(g gVar) {
        e0.d("#008 Must be called on the main UI thread.");
        zzbdc.zza(getContext());
        if (((Boolean) zzbfa.zzf.zze()).booleanValue()) {
            if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzlu)).booleanValue()) {
                rc.c.f14330b.execute(new a8.e(3, this, gVar, false));
                return;
            }
        }
        this.f6708a.b(gVar.f6695a);
    }

    public c getAdListener() {
        return this.f6708a.f12213f;
    }

    public h getAdSize() {
        s3 s3VarZzg;
        s2 s2Var = this.f6708a;
        s2Var.getClass();
        try {
            m0 m0Var = s2Var.f12216i;
            if (m0Var != null && (s3VarZzg = m0Var.zzg()) != null) {
                return new h(s3VarZzg.f12224e, s3VarZzg.f12221b, s3VarZzg.f12220a);
            }
        } catch (RemoteException e10) {
            rc.k.i("#007 Could not call remote method.", e10);
        }
        h[] hVarArr = s2Var.f12214g;
        if (hVarArr != null) {
            return hVarArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        m0 m0Var;
        s2 s2Var = this.f6708a;
        if (s2Var.f12217k == null && (m0Var = s2Var.f12216i) != null) {
            try {
                s2Var.f12217k = m0Var.zzr();
            } catch (RemoteException e10) {
                rc.k.i("#007 Could not call remote method.", e10);
            }
        }
        return s2Var.f12217k;
    }

    public q getOnPaidEventListener() {
        this.f6708a.getClass();
        return null;
    }

    public t getResponseInfo() {
        m0 m0Var;
        s2 s2Var = this.f6708a;
        s2Var.getClass();
        try {
            m0Var = s2Var.f12216i;
        } catch (RemoteException e10) {
            rc.k.i("#007 Could not call remote method.", e10);
        }
        i2 i2VarZzk = m0Var != null ? m0Var.zzk() : null;
        if (i2VarZzk != null) {
            return new t(i2VarZzk);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i14 = ((i12 - i10) - measuredWidth) / 2;
        int i15 = ((i13 - i11) - measuredHeight) / 2;
        childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        h adSize;
        int measuredHeight;
        int iB;
        int iB2;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e10) {
                rc.k.e("Unable to retrieve ad size.", e10);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int i12 = adSize.f6698a;
                if (i12 == -3) {
                    iB = -1;
                } else if (i12 != -1) {
                    rc.e eVar = nc.s.f12202f.f12203a;
                    iB = rc.e.b(context, i12);
                } else {
                    iB = context.getResources().getDisplayMetrics().widthPixels;
                }
                int i13 = adSize.f6699b;
                if (i13 == -4 || i13 == -3) {
                    iB2 = -1;
                } else if (i13 != -2) {
                    rc.e eVar2 = nc.s.f12202f.f12203a;
                    iB2 = rc.e.b(context, i13);
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f10 = displayMetrics.heightPixels;
                    float f11 = displayMetrics.density;
                    int i14 = (int) (f10 / f11);
                    iB2 = (int) ((i14 <= 400 ? 32 : i14 <= 720 ? 50 : 90) * f11);
                }
                measuredHeight = iB2;
                measuredWidth = iB;
            } else {
                measuredHeight = 0;
            }
        } else {
            measureChild(childAt, i10, i11);
            measuredWidth = childAt.getMeasuredWidth();
            measuredHeight = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(measuredHeight, getSuggestedMinimumHeight()), i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(c cVar) {
        s2 s2Var = this.f6708a;
        s2Var.f12213f = cVar;
        r2 r2Var = s2Var.f12211d;
        synchronized (r2Var.f12198a) {
            r2Var.f12199b = cVar;
        }
        if (cVar == 0) {
            s2Var.c(null);
            return;
        }
        if (cVar instanceof nc.a) {
            s2Var.c((nc.a) cVar);
        }
        if (cVar instanceof gc.e) {
            s2Var.e((gc.e) cVar);
        }
    }

    public void setAdSize(h hVar) {
        h[] hVarArr = {hVar};
        s2 s2Var = this.f6708a;
        if (s2Var.f12214g != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        s2Var.d(hVarArr);
    }

    public void setAdUnitId(String str) {
        s2 s2Var = this.f6708a;
        if (s2Var.f12217k != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        s2Var.f12217k = str;
    }

    public void setOnPaidEventListener(q qVar) {
        s2 s2Var = this.f6708a;
        s2Var.getClass();
        try {
            m0 m0Var = s2Var.f12216i;
            if (m0Var != null) {
                m0Var.zzP(new i3());
            }
        } catch (RemoteException e10) {
            rc.k.i("#007 Could not call remote method.", e10);
        }
    }
}
