package tb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f16266a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16267b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16268c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16269d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16270e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16271f;

    /* renamed from: g, reason: collision with root package name */
    public final String f16272g;

    /* renamed from: h, reason: collision with root package name */
    public final String f16273h;

    /* renamed from: i, reason: collision with root package name */
    public final String f16274i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f16275k;

    /* renamed from: l, reason: collision with root package name */
    public final String f16276l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f16266a = num;
        this.f16267b = str;
        this.f16268c = str2;
        this.f16269d = str3;
        this.f16270e = str4;
        this.f16271f = str5;
        this.f16272g = str6;
        this.f16273h = str7;
        this.f16274i = str8;
        this.j = str9;
        this.f16275k = str10;
        this.f16276l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f16266a;
            if (num != null ? num.equals(((h) aVar).f16266a) : ((h) aVar).f16266a == null) {
                String str = this.f16267b;
                if (str != null ? str.equals(((h) aVar).f16267b) : ((h) aVar).f16267b == null) {
                    String str2 = this.f16268c;
                    if (str2 != null ? str2.equals(((h) aVar).f16268c) : ((h) aVar).f16268c == null) {
                        String str3 = this.f16269d;
                        if (str3 != null ? str3.equals(((h) aVar).f16269d) : ((h) aVar).f16269d == null) {
                            String str4 = this.f16270e;
                            if (str4 != null ? str4.equals(((h) aVar).f16270e) : ((h) aVar).f16270e == null) {
                                String str5 = this.f16271f;
                                if (str5 != null ? str5.equals(((h) aVar).f16271f) : ((h) aVar).f16271f == null) {
                                    String str6 = this.f16272g;
                                    if (str6 != null ? str6.equals(((h) aVar).f16272g) : ((h) aVar).f16272g == null) {
                                        String str7 = this.f16273h;
                                        if (str7 != null ? str7.equals(((h) aVar).f16273h) : ((h) aVar).f16273h == null) {
                                            String str8 = this.f16274i;
                                            if (str8 != null ? str8.equals(((h) aVar).f16274i) : ((h) aVar).f16274i == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(((h) aVar).j) : ((h) aVar).j == null) {
                                                    String str10 = this.f16275k;
                                                    if (str10 != null ? str10.equals(((h) aVar).f16275k) : ((h) aVar).f16275k == null) {
                                                        String str11 = this.f16276l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f16276l) : ((h) aVar).f16276l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f16266a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f16267b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f16268c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f16269d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f16270e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f16271f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f16272g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f16273h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f16274i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f16275k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f16276l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f16266a);
        sb2.append(", model=");
        sb2.append(this.f16267b);
        sb2.append(", hardware=");
        sb2.append(this.f16268c);
        sb2.append(", device=");
        sb2.append(this.f16269d);
        sb2.append(", product=");
        sb2.append(this.f16270e);
        sb2.append(", osBuild=");
        sb2.append(this.f16271f);
        sb2.append(", manufacturer=");
        sb2.append(this.f16272g);
        sb2.append(", fingerprint=");
        sb2.append(this.f16273h);
        sb2.append(", locale=");
        sb2.append(this.f16274i);
        sb2.append(", country=");
        sb2.append(this.j);
        sb2.append(", mccMnc=");
        sb2.append(this.f16275k);
        sb2.append(", applicationBuild=");
        return m6.a.j(sb2, this.f16276l, "}");
    }
}
