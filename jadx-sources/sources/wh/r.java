package wh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class r extends od.a {
    public static final Parcelable.Creator<r> CREATOR = new pc.j(18);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f19375a;

    /* renamed from: b, reason: collision with root package name */
    public q.e f19376b;

    /* renamed from: c, reason: collision with root package name */
    public i f19377c;

    public r(Bundle bundle) {
        this.f19375a = bundle;
    }

    public final Map b() {
        if (this.f19376b == null) {
            q.e eVar = new q.e(0);
            Bundle bundle = this.f19375a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        eVar.put(str, str2);
                    }
                }
            }
            this.f19376b = eVar;
        }
        return this.f19376b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.U(parcel, 2, this.f19375a, false);
        uk.c.j0(iH0, parcel);
    }
}
