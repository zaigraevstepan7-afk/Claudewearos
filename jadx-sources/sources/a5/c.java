package a5;

import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f179d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f180e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f181b;

    /* renamed from: c, reason: collision with root package name */
    public final String f182c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        super(str2, str);
        this.f181b = 0;
        this.f182c = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }

    @Override // a5.d
    public final String a() {
        switch (this.f181b) {
        }
        return this.f182c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(b5.a aVar, String str) {
        this.f181b = 1;
        String strConcat = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(aVar.f1574a);
        this.f181b = 1;
        l.f(strConcat, "type");
        super(str, strConcat);
        this.f182c = strConcat;
        if (strConcat.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
