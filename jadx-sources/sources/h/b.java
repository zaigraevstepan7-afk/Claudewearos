package h;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import fj.l;
import i4.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import pi.h;
import qi.m;
import qi.s;
import qi.t;
import u6.v;
import w5.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7556b;

    public /* synthetic */ b(int i10) {
        this.f7556b = i10;
    }

    @Override // u6.v
    public a J(Context context, Object obj) {
        switch (this.f7556b) {
            case 0:
                l.f((String) obj, "input");
                return null;
            case 1:
                l.f((String[]) obj, "input");
                return null;
            case 2:
                l.f((String[]) obj, "input");
                return null;
            case 3:
                if (obj != null) {
                    throw new ClassCastException();
                }
                l.f(null, "input");
                return null;
            case 4:
                String[] strArr = (String[]) obj;
                l.f(strArr, "input");
                if (strArr.length == 0) {
                    return new a(t.f13521a);
                }
                for (String str : strArr) {
                    if (c.checkSelfPermission(context, str) != 0) {
                        return null;
                    }
                }
                int iG0 = qi.v.g0(strArr.length);
                if (iG0 < 16) {
                    iG0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new a(linkedHashMap);
            default:
                return super.J(context, obj);
        }
    }

    @Override // u6.v
    public final Object S(int i10, Intent intent) {
        List arrayList;
        switch (this.f7556b) {
            case 0:
                if (i10 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    break;
                }
                break;
            case 1:
                if (i10 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    break;
                }
                break;
            case 2:
                if (i10 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Uri data = intent.getData();
                    if (data != null) {
                        linkedHashSet.add(data);
                    }
                    ClipData clipData = intent.getClipData();
                    if (clipData != null || !linkedHashSet.isEmpty()) {
                        if (clipData != null) {
                            int itemCount = clipData.getItemCount();
                            for (int i11 = 0; i11 < itemCount; i11++) {
                                Uri uri = clipData.getItemAt(i11).getUri();
                                if (uri != null) {
                                    linkedHashSet.add(uri);
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 3:
                if (i10 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    Uri data2 = intent.getData();
                    if (data2 == null) {
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        Uri data3 = intent.getData();
                        if (data3 != null) {
                            linkedHashSet2.add(data3);
                        }
                        ClipData clipData2 = intent.getClipData();
                        if (clipData2 == null && linkedHashSet2.isEmpty()) {
                            arrayList = s.f13520a;
                        } else {
                            if (clipData2 != null) {
                                int itemCount2 = clipData2.getItemCount();
                                for (int i12 = 0; i12 < itemCount2; i12++) {
                                    Uri uri2 = clipData2.getItemAt(i12).getUri();
                                    if (uri2 != null) {
                                        linkedHashSet2.add(uri2);
                                    }
                                }
                            }
                            arrayList = new ArrayList(linkedHashSet2);
                        }
                        break;
                    }
                }
                break;
            case 4:
                if (i10 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                        for (int i13 : intArrayExtra) {
                            arrayList2.add(Boolean.valueOf(i13 == 0));
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (String str : stringArrayExtra) {
                            if (str != null) {
                                arrayList3.add(str);
                            }
                        }
                        Iterator it = arrayList3.iterator();
                        Iterator it2 = arrayList2.iterator();
                        ArrayList arrayList4 = new ArrayList(Math.min(m.s0(arrayList3), m.s0(arrayList2)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList4.add(new h(it.next(), it2.next()));
                        }
                        break;
                    }
                }
                break;
        }
        return new g.a(i10, intent);
    }

    @Override // u6.v
    public final Intent t(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f7556b) {
            case 0:
                String str = (String) obj;
                l.f(str, "input");
                Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType("application/json").putExtra("android.intent.extra.TITLE", str);
                l.e(intentPutExtra, "putExtra(...)");
                return intentPutExtra;
            case 1:
                String[] strArr = (String[]) obj;
                l.f(strArr, "input");
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
                l.e(type, "setType(...)");
                return type;
            case 2:
                String[] strArr2 = (String[]) obj;
                l.f(strArr2, "input");
                Intent type2 = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr2).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
                l.e(type2, "setType(...)");
                return type2;
            case 3:
                if (obj != null) {
                    throw new ClassCastException();
                }
                l.f(null, "input");
                throw null;
            case 4:
                String[] strArr3 = (String[]) obj;
                l.f(strArr3, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr3);
                l.e(intentPutExtra2, "putExtra(...)");
                return intentPutExtra2;
            case 5:
                Intent intent = (Intent) obj;
                l.f(intent, "input");
                return intent;
            case 6:
                g.h hVar = (g.h) obj;
                l.f(hVar, "input");
                Intent intentPutExtra3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar);
                l.e(intentPutExtra3, "putExtra(...)");
                return intentPutExtra3;
            default:
                g.h hVar2 = (g.h) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = hVar2.f6846b;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = hVar2.f6845a;
                        l.f(intentSender, "intentSender");
                        hVar2 = new g.h(intentSender, null, hVar2.f6847c, hVar2.f6848d);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar2);
                if (i0.J(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
                }
                return intent2;
        }
    }

    public /* synthetic */ b(boolean z2) {
        this.f7556b = 5;
    }
}
