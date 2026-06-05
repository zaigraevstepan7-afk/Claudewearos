package v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f17470a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ s[] f17471b;

    static {
        s sVar = new s("EditableText", 0);
        f17470a = sVar;
        s[] sVarArr = {sVar, new s("StaticText", 1)};
        f17471b = sVarArr;
        u0.c.j(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f17471b.clone();
    }
}
