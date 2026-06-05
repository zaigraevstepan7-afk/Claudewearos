package h4;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import f0.i0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7633a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f7637e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f7638f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f7639g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f7640h;

    /* renamed from: i, reason: collision with root package name */
    public int f7641i;
    public int j;

    /* renamed from: l, reason: collision with root package name */
    public i0 f7643l;

    /* renamed from: n, reason: collision with root package name */
    public Bundle f7645n;

    /* renamed from: q, reason: collision with root package name */
    public String f7648q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f7649r;

    /* renamed from: s, reason: collision with root package name */
    public final Notification f7650s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f7651t;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7634b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7635c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7636d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f7642k = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7644m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f7646o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f7647p = 0;

    public l(Context context, String str) {
        Notification notification = new Notification();
        this.f7650s = notification;
        this.f7633a = context;
        this.f7648q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.f7651t = new ArrayList();
        this.f7649r = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Notification a() {
        Bundle bundle;
        int i10;
        ArrayList arrayList;
        int i11;
        a8.j jVar = new a8.j();
        new ArrayList();
        jVar.f218d = new Bundle();
        jVar.f217c = this;
        Context context = this.f7633a;
        jVar.f215a = context;
        Notification.Builder builder = new Notification.Builder(context, this.f7648q);
        jVar.f216b = builder;
        Notification notification = this.f7650s;
        Context context2 = null;
        int i12 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f7637e).setContentText(this.f7638f).setContentInfo(null).setContentIntent(this.f7639g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(this.f7641i).setProgress(0, 0, false);
        IconCompat iconCompat = this.f7640h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.e(context));
        builder.setSubText(null).setUsesChronometer(false).setPriority(this.j);
        ArrayList arrayList2 = this.f7634b;
        int size = arrayList2.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            f fVar = (f) obj;
            int i14 = Build.VERSION.SDK_INT;
            if (fVar.f7623b == null && (i11 = fVar.f7626e) != 0) {
                fVar.f7623b = IconCompat.a(i11);
            }
            IconCompat iconCompat2 = fVar.f7623b;
            boolean z2 = fVar.f7624c;
            Bundle bundle2 = fVar.f7622a;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.e(context2) : context2, fVar.f7627f, fVar.f7628g);
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            bundle3.putBoolean("android.support.allowGeneratedReplies", z2);
            builder2.setAllowGeneratedReplies(z2);
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i14 >= 28) {
                m.a(builder2);
            }
            if (i14 >= 29) {
                c.d(builder2);
            }
            if (i14 >= 31) {
                n.a(builder2);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", fVar.f7625d);
            builder2.addExtras(bundle3);
            ((Notification.Builder) jVar.f216b).addAction(builder2.build());
            context2 = null;
        }
        Bundle bundle4 = this.f7645n;
        if (bundle4 != null) {
            ((Bundle) jVar.f218d).putAll(bundle4);
        }
        int i15 = Build.VERSION.SDK_INT;
        ((Notification.Builder) jVar.f216b).setShowWhen(this.f7642k);
        ((Notification.Builder) jVar.f216b).setLocalOnly(this.f7644m);
        ((Notification.Builder) jVar.f216b).setGroup(null);
        ((Notification.Builder) jVar.f216b).setSortKey(null);
        ((Notification.Builder) jVar.f216b).setGroupSummary(false);
        ((Notification.Builder) jVar.f216b).setCategory(null);
        ((Notification.Builder) jVar.f216b).setColor(this.f7646o);
        ((Notification.Builder) jVar.f216b).setVisibility(this.f7647p);
        ((Notification.Builder) jVar.f216b).setPublicVersion(null);
        ((Notification.Builder) jVar.f216b).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList3 = this.f7651t;
        ArrayList arrayList4 = this.f7635c;
        if (i15 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    throw gk.b.k(it);
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    q.f fVar2 = new q.f(arrayList3.size() + arrayList.size());
                    fVar2.addAll(arrayList);
                    fVar2.addAll(arrayList3);
                    arrayList3 = new ArrayList(fVar2);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj2 = arrayList3.get(i16);
                i16++;
                ((Notification.Builder) jVar.f216b).addPerson((String) obj2);
            }
        }
        ArrayList arrayList5 = this.f7636d;
        if (arrayList5.size() > 0) {
            if (this.f7645n == null) {
                this.f7645n = new Bundle();
            }
            Bundle bundle5 = this.f7645n.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i17 = 0;
            while (i17 < arrayList5.size()) {
                String string = Integer.toString(i17);
                f fVar3 = (f) arrayList5.get(i17);
                Bundle bundle8 = new Bundle();
                if (fVar3.f7623b == null && (i10 = fVar3.f7626e) != 0) {
                    fVar3.f7623b = IconCompat.a(i10);
                }
                IconCompat iconCompat3 = fVar3.f7623b;
                Bundle bundle9 = fVar3.f7622a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.b() : i12);
                bundle8.putCharSequence("title", fVar3.f7627f);
                bundle8.putParcelable("actionIntent", fVar3.f7628g);
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", fVar3.f7624c);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", fVar3.f7625d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i17++;
                i12 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.f7645n == null) {
                this.f7645n = new Bundle();
            }
            this.f7645n.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) jVar.f218d).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i18 = Build.VERSION.SDK_INT;
        ((Notification.Builder) jVar.f216b).setExtras(this.f7645n);
        ((Notification.Builder) jVar.f216b).setRemoteInputHistory(null);
        ((Notification.Builder) jVar.f216b).setBadgeIconType(0);
        ((Notification.Builder) jVar.f216b).setSettingsText(null);
        ((Notification.Builder) jVar.f216b).setShortcutId(null);
        ((Notification.Builder) jVar.f216b).setTimeoutAfter(0L);
        ((Notification.Builder) jVar.f216b).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(this.f7648q)) {
            ((Notification.Builder) jVar.f216b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i18 >= 28) {
            Iterator it2 = arrayList4.iterator();
            if (it2.hasNext()) {
                throw gk.b.k(it2);
            }
        }
        if (i18 >= 29) {
            c.b((Notification.Builder) jVar.f216b, this.f7649r);
            c.c((Notification.Builder) jVar.f216b);
        }
        if (i18 >= 36) {
            o.a((Notification.Builder) jVar.f216b);
        }
        l lVar = (l) jVar.f217c;
        i0 i0Var = lVar.f7643l;
        if (i0Var != null) {
            i0Var.c(jVar);
        }
        Notification notificationBuild = ((Notification.Builder) jVar.f216b).build();
        if (i0Var != null) {
            lVar.f7643l.getClass();
        }
        if (i0Var != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", i0Var.h());
        }
        return notificationBuild;
    }

    public final void c(boolean z2) {
        Notification notification = this.f7650s;
        if (z2) {
            notification.flags |= 16;
        } else {
            notification.flags &= -17;
        }
    }

    public final void d(i0 i0Var) {
        if (this.f7643l != i0Var) {
            this.f7643l = i0Var;
            if (((l) i0Var.f6149a) != this) {
                i0Var.f6149a = this;
                d(i0Var);
            }
        }
    }
}
