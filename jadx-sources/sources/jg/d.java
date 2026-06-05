package jg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import ig.a0;
import ig.f0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d extends ig.l {
    public static final Parcelable.Creator<d> CREATOR = new c(0);
    public Boolean A;
    public e B;
    public boolean C;
    public f0 D;
    public l E;
    public List F;

    /* renamed from: a, reason: collision with root package name */
    public zzafm f8872a;

    /* renamed from: b, reason: collision with root package name */
    public y f8873b;

    /* renamed from: c, reason: collision with root package name */
    public String f8874c;

    /* renamed from: d, reason: collision with root package name */
    public String f8875d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f8876e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f8877f;

    /* renamed from: z, reason: collision with root package name */
    public String f8878z;

    public d(cg.i iVar, ArrayList arrayList) {
        iVar.b();
        this.f8874c = iVar.f3368b;
        this.f8875d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f8878z = "2";
        d(arrayList);
    }

    @Override // ig.a0
    public final String a() {
        return this.f8873b.f8921b;
    }

    @Override // ig.l
    public final String b() {
        Map map;
        zzafm zzafmVar = this.f8872a;
        if (zzafmVar == null || zzafmVar.zzc() == null || (map = (Map) k.a(this.f8872a.zzc()).f8555b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // ig.l
    public final boolean c() {
        String str;
        Boolean bool = this.A;
        if (bool == null || bool.booleanValue()) {
            zzafm zzafmVar = this.f8872a;
            if (zzafmVar != null) {
                Map map = (Map) k.a(zzafmVar.zzc()).f8555b.get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z2 = true;
            if (this.f8876e.size() > 1 || (str != null && str.equals("custom"))) {
                z2 = false;
            }
            this.A = Boolean.valueOf(z2);
        }
        return this.A.booleanValue();
    }

    @Override // ig.l
    public final synchronized d d(List list) {
        try {
            e0.i(list);
            this.f8876e = new ArrayList(list.size());
            this.f8877f = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                a0 a0Var = (a0) list.get(i10);
                if (a0Var.a().equals("firebase")) {
                    this.f8873b = (y) a0Var;
                } else {
                    this.f8877f.add(a0Var.a());
                }
                this.f8876e.add((y) a0Var);
            }
            if (this.f8873b == null) {
                this.f8873b = (y) this.f8876e.get(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @Override // ig.l
    public final void e(ArrayList arrayList) {
        l lVar;
        if (arrayList.isEmpty()) {
            lVar = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ig.q qVar = (ig.q) obj;
                if (qVar instanceof ig.v) {
                    arrayList2.add((ig.v) qVar);
                } else if (qVar instanceof ig.y) {
                    arrayList3.add((ig.y) qVar);
                }
            }
            lVar = new l(arrayList2, arrayList3);
        }
        this.E = lVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 1, this.f8872a, i10, false);
        uk.c.b0(parcel, 2, this.f8873b, i10, false);
        uk.c.c0(parcel, 3, this.f8874c, false);
        uk.c.c0(parcel, 4, this.f8875d, false);
        uk.c.g0(parcel, 5, this.f8876e, false);
        uk.c.e0(parcel, 6, this.f8877f);
        uk.c.c0(parcel, 7, this.f8878z, false);
        boolean zC = c();
        uk.c.k0(parcel, 8, 4);
        parcel.writeInt(zC ? 1 : 0);
        uk.c.b0(parcel, 9, this.B, i10, false);
        boolean z2 = this.C;
        uk.c.k0(parcel, 10, 4);
        parcel.writeInt(z2 ? 1 : 0);
        uk.c.b0(parcel, 11, this.D, i10, false);
        uk.c.b0(parcel, 12, this.E, i10, false);
        uk.c.g0(parcel, 13, this.F, false);
        uk.c.j0(iH0, parcel);
    }
}
