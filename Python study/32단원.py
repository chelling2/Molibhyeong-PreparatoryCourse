files = ['font', '1.png', '10.jpg','11.gif','2.jpg','3.png','table.xslx','spec.docx']
print(list(filter(lambda x : x.find('.jpg') != -1 or x.find('.png') != -1, files)))





files = input().split()
print(list(map(lambda x: '{0:03d}.{1}'.format(int(x.split('.')[0]),x.split('.')[1]) ,files)))
