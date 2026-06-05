package u6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f16784a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f16785b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f16786c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ s[] f16787d;

    static {
        s sVar = new s("AUTOMATIC", 0);
        f16784a = sVar;
        s sVar2 = new s("TRUNCATE", 1);
        f16785b = sVar2;
        s sVar3 = new s("WRITE_AHEAD_LOGGING", 2);
        f16786c = sVar3;
        s[] sVarArr = {sVar, sVar2, sVar3};
        f16787d = sVarArr;
        u0.c.j(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f16787d.clone();
    }
}
