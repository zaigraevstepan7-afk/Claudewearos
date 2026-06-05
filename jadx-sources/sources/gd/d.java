package gd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends zzbz {
    public static final Parcelable.Creator<d> CREATOR = new dd.d(28);

    /* renamed from: z, reason: collision with root package name */
    public static final q.e f7373z;

    /* renamed from: a, reason: collision with root package name */
    public final int f7374a;

    /* renamed from: b, reason: collision with root package name */
    public List f7375b;

    /* renamed from: c, reason: collision with root package name */
    public List f7376c;

    /* renamed from: d, reason: collision with root package name */
    public List f7377d;

    /* renamed from: e, reason: collision with root package name */
    public List f7378e;

    /* renamed from: f, reason: collision with root package name */
    public List f7379f;

    static {
        q.e eVar = new q.e(0);
        f7373z = eVar;
        eVar.put("registered", sd.a.b(2, "registered"));
        eVar.put("in_progress", sd.a.b(3, "in_progress"));
        eVar.put("success", sd.a.b(4, "success"));
        eVar.put("failed", sd.a.b(5, "failed"));
        eVar.put("escrowed", sd.a.b(6, "escrowed"));
    }

    public d(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f7374a = i10;
        this.f7375b = arrayList;
        this.f7376c = arrayList2;
        this.f7377d = arrayList3;
        this.f7378e = arrayList4;
        this.f7379f = arrayList5;
    }

    @Override // sd.b
    public final Map getFieldMappings() {
        return f7373z;
    }

    @Override // sd.b
    public final Object getFieldValue(sd.a aVar) {
        switch (aVar.f14977z) {
            case 1:
                return Integer.valueOf(this.f7374a);
            case 2:
                return this.f7375b;
            case 3:
                return this.f7376c;
            case 4:
                return this.f7377d;
            case 5:
                return this.f7378e;
            case 6:
                return this.f7379f;
            default:
                throw new IllegalStateException(m6.a.d(aVar.f14977z, "Unknown SafeParcelable id="));
        }
    }

    @Override // sd.b
    public final boolean isFieldSet(sd.a aVar) {
        return true;
    }

    @Override // sd.b
    public final void setStringsInternal(sd.a aVar, String str, ArrayList arrayList) {
        int i10 = aVar.f14977z;
        if (i10 == 2) {
            this.f7375b = arrayList;
            return;
        }
        if (i10 == 3) {
            this.f7376c = arrayList;
            return;
        }
        if (i10 == 4) {
            this.f7377d = arrayList;
        } else if (i10 == 5) {
            this.f7378e = arrayList;
        } else {
            if (i10 != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(i10)));
            }
            this.f7379f = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f7374a);
        uk.c.e0(parcel, 2, this.f7375b);
        uk.c.e0(parcel, 3, this.f7376c);
        uk.c.e0(parcel, 4, this.f7377d);
        uk.c.e0(parcel, 5, this.f7378e);
        uk.c.e0(parcel, 6, this.f7379f);
        uk.c.j0(iH0, parcel);
    }
}
