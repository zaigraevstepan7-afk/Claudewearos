package rh;

import y3.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f14499a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14500b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14501c;

    /* renamed from: d, reason: collision with root package name */
    public final b f14502d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14503e;

    public a(String str, String str2, String str3, b bVar, int i10) {
        this.f14499a = str;
        this.f14500b = str2;
        this.f14501c = str3;
        this.f14502d = bVar;
        this.f14503e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i10 = aVar.f14503e;
        b bVar = aVar.f14502d;
        String str = aVar.f14501c;
        String str2 = aVar.f14500b;
        String str3 = aVar.f14499a;
        String str4 = this.f14499a;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = this.f14500b;
        if (str5 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str5.equals(str2)) {
            return false;
        }
        String str6 = this.f14501c;
        if (str6 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str6.equals(str)) {
            return false;
        }
        b bVar2 = this.f14502d;
        if (bVar2 == null) {
            if (bVar != null) {
                return false;
            }
        } else if (!bVar2.equals(bVar)) {
            return false;
        }
        int i11 = this.f14503e;
        return i11 == 0 ? i10 == 0 : e.a(i11, i10);
    }

    public final int hashCode() {
        String str = this.f14499a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f14500b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f14501c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f14502d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i10 = this.f14503e;
        return (i10 != 0 ? e.b(i10) : 0) ^ iHashCode4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f14499a);
        sb2.append(", fid=");
        sb2.append(this.f14500b);
        sb2.append(", refreshToken=");
        sb2.append(this.f14501c);
        sb2.append(", authToken=");
        sb2.append(this.f14502d);
        sb2.append(", responseCode=");
        int i10 = this.f14503e;
        sb2.append(i10 != 1 ? i10 != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb2.append("}");
        return sb2.toString();
    }
}
