package t2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f15632a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f15633b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s[] f15634c;

    static {
        s sVar = new s("Min", 0);
        f15632a = sVar;
        s sVar2 = new s("Max", 1);
        f15633b = sVar2;
        s[] sVarArr = {sVar, sVar2};
        f15634c = sVarArr;
        u0.c.j(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f15634c.clone();
    }
}
